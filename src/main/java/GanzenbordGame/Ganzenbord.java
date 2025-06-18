package GanzenbordGame;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Ganzenbord {

    ArrayList<Player> players = new ArrayList<>();

    static Player[] addPlayers(int amountOfPlayers, Scanner scanner) {
        Player[] players = new Player[amountOfPlayers];

        for (int i = 0; i < amountOfPlayers; i++) {
            System.out.println("What is your name?");
            String tempName = scanner.nextLine();
            Player newPlayer = new Player(tempName);
            players[i] = newPlayer;
        }

        return players;
    }

    public void startGame(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many players will be playing?");
        String amountOfPlayers = scanner.nextLine();
        int amountOfPlayersFinal = Integer.parseInt(amountOfPlayers);
        Dice dice = new Dice();
        Board board = new Board();
        Player startingPlayer = null;
        players = new ArrayList<Player>(Arrays.asList(addPlayers(amountOfPlayersFinal, scanner)));

        System.out.println("Great, first we need to roll the dice to see who starts first.");

        ArrayList<Player> winningPlayers = new ArrayList<>(players);
        ArrayList<Integer> rolls = new ArrayList<>();

        do {

            System.out.println("Rolling for " + winningPlayers.size() + " players");
            for (int i = 0; i < winningPlayers.size(); i++) {
                rolls.add(dice.singleRoll());
            }
            winningPlayers = determineWinners(winningPlayers, rolls);
            rolls.clear();
        } while (winningPlayers.size() != 1);

        startingPlayer = winningPlayers.get(0);

        int startingIndex = players.indexOf(winningPlayers.getFirst());

        System.out.println(startingPlayer.getName() + " starts the game!");

        int currentIndex = startingIndex;
        int turn = 0;

        do {

            System.out.println("Are you ready for your turn? Y/N");
            String input = scanner.nextLine();

            if (input.equals("Y") || input.equals("y") || input.equals("yes") || input.equals("Yes")) {

                Player currentPlayer = players.get(currentIndex);
                int firstRoll = dice.singleRoll();
                int secondRoll = dice.singleRoll();
                int move = firstRoll + secondRoll;

                if (turn == 1 && firstRoll == 4 && secondRoll == 5) {
                    currentPlayer.setPosition(53);
                    System.out.println(currentPlayer.getName() + " rolled " + firstRoll + " and "
                            + secondRoll + " and moved to " + currentPlayer.getPosition());
                    Board.tileType tile = board.getTileType(currentPlayer.getPosition());

                    System.out.println();

                } else if (turn == 1 && firstRoll == 3 && secondRoll == 6) {
                    currentPlayer.setPosition(26);
                    System.out.println(currentPlayer.getName() + " rolled " + firstRoll + " and "
                            + secondRoll + " and moved to " + currentPlayer.getPosition());

                    System.out.println();
                }

                currentPlayer.setPosition(currentPlayer.getPosition() + move);
                Board.tileType tile = board.getTileType(currentPlayer.getPosition());


                switch (tile) {
                    case GOOSE -> {
                        System.out.println("Goose tile! Move again by " + move + " steps.");
                        currentPlayer.setPosition(currentPlayer.getPosition() + move);
                    }
                    case BRIDGE -> {
                        System.out.println("Bridge tile! You jump to tile 12.");
                        currentPlayer.setPosition(12);
                    }
                    case INN, WELL -> {
                        currentPlayer.setSkipNextTurn(true);
                    }
                    case MAZE -> {
                        System.out.println("Maze tile! You go back to tile 39.");
                        currentPlayer.setPosition(37);
                    }
                    case PRISON -> {
                        System.out.println("Prison tile! Skip 3 turns.");
                        currentPlayer.putInPrison(true);
                        currentPlayer.setTurnEnteredPrison(turn);
                    }
                    case DEATH -> {
                        System.out.println("Death tile! You go back to start.");
                        currentPlayer.setPosition(0);
                    }
                    default -> {
                        System.out.println("default tile");
                    }
                }

                System.out.println(currentPlayer.getName() + " rolled " + firstRoll + " and "
                        + secondRoll + " and moved to " + currentPlayer.getPosition());
                System.out.println();

                for (Player p : players) {
                    if (p.isInPrison() && p.getTurnEnteredPrison() < turn &&
                            currentPlayer.getPosition() > 52) {
                        p.putInPrison(false);
                        p.setTurnEnteredPrison(-1);
                        System.out.println(p.getName() + " has been freed from prison!");
                    }
                }

                if (currentPlayer.isSkipNextTurn()) {
                    System.out.println(currentPlayer.getName() + " must skip this turn.");
                    currentPlayer.setSkipNextTurn(false);
                    currentIndex = (currentIndex + 1) % players.size();
                    continue;
                }

                if (currentPlayer.getPosition() > 63) {
                    currentPlayer.setPosition(63 - (currentPlayer.getPosition() - 63));
                }
                if (currentPlayer.getPosition() == 63) break;
                currentIndex = (currentIndex + 1) % players.size();


            } else {
                System.out.println("Are you ready for your turn? Y/N");
                return;
            }
        } while (true);

    }


    static ArrayList<Player> determineWinners(ArrayList<Player> players, ArrayList<Integer> rolls) {
        int max = 0;
        ArrayList<Player> winningPlayers = new ArrayList<>();
        for (int i = 0; i < rolls.size(); i++) {
            System.out.println(players.get(i).getName() + ", your roll is: " + rolls.get(i));

            if (rolls.get(i) > max) {
                max = rolls.get(i);
                winningPlayers.clear();
                winningPlayers.add(players.get(i));
            } else if (rolls.get(i) == max) {
                winningPlayers.add(players.get(i));
            }
        }

        return winningPlayers;
    }
}






