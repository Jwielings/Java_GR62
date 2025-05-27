package Class23rdOfMay.GalgjeOpdracht;
import java.util.Arrays;

public class IncorrectGuess {

    private String[] hangman = {"""
  +---+
  |   |
      |
      |
      |
      |
=========""", """
  +---+
  |   |
  O   |
      |
      |
      |
=========""", """
  +---+
  |   |
  O   |
  |   |
      |
      |
=========""", """
  +---+
  |   |
  O   |
 /|   |
      |
      |
=========""", """
  +---+
  |   |
  O   |
 /|\\  |
      |
      |
=========""", """
  +---+
  |   |
  O   |
 /|\\  |
 /    |
      |
=========""", """
  +---+
  |   |
  O   |
 /|\\  |
 / \\  |
      |
========="""};

    public void incorrectGuess(int attemptsUsed) {
        if (attemptsUsed < hangman.length) {
            System.out.println(hangman[attemptsUsed]);
        } else {
            System.out.println("Game over, you've been hanged!");
        }
    }

    public int getMaxAttempts() {
        return hangman.length;
    }
}

