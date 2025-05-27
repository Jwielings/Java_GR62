    package Class23rdOfMay.GalgjeOpdracht;
    import java.util.ArrayList;
    import java.util.List;
    import java.util.Scanner;

    public class Galgje {

        IncorrectGuess incorrect = new IncorrectGuess();
        Scanner scanner = new Scanner(System.in);

        private String hangmanInput;
        private String guess;
        private int attemptsLeft;
        private List<String> galg = new ArrayList<>();
        private char ch;


        public void gameStart() {

            System.out.println("Player 1, choose a word:");
            setHangmanInput(scanner.nextLine());
            System.out.println("\n".repeat(50));
            setAttemptsLeft(incorrect.getMaxAttempts());
            System.out.println("You have: " + incorrect.getMaxAttempts() + " attempts left!");

            for (int i = 0; i < getHangmanInput().length(); i++) {
                galg.add("_");
            }
        }

        public void playGame() {
            do {
                for (int i = 0; i < galg.size(); i++) {
                    System.out.print(galg.get(i));
                }
                System.out.println();
                System.out.println("Player 2, guess the letter:");
                setGuess(scanner.nextLine());
                System.out.println("You have guessed: " + guess + "!");

                boolean foundMatch = false;

                if (getHangmanInput().contains(getGuess())) {
                    for (int i = 0; i < getHangmanInput().length(); i++) {
                        if (getHangmanInput().charAt(i) == getGuess().charAt(0)) {
                            galg.set(i, getGuess());
                            foundMatch = true;
                        }
                    }
                }

                if (!foundMatch) {
                    int attemptsUsed = incorrect.getMaxAttempts() - getAttemptsLeft();
                    incorrect.incorrectGuess(attemptsUsed);
                    setAttemptsLeft(getAttemptsLeft() - 1);
                    System.out.println("You have: " + getAttemptsLeft() + " attempts left :(.");
                }
            } while (getGalg().contains("_") && getAttemptsLeft() > 0);
        }

        public String getHangmanInput() {
            return hangmanInput;
        }

        public void setHangmanInput(String hangmanInput) {
            this.hangmanInput = hangmanInput;
        }

        public String getGuess() {
            return guess;
        }

        public void setGuess(String guess) {
            this.guess = guess;
        }

        public List<String> getGalg() {
            return galg;
        }

        public int getAttemptsLeft() {
            return attemptsLeft;
        }

        public void setAttemptsLeft(int attemptsLeft) {
            this.attemptsLeft = attemptsLeft;

        }
    }

