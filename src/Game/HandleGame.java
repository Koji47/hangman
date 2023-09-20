package Game;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static Game.HandleWords.*;
import static Game.HangMan.drawHangMan;

public class HandleGame {
    static HandleLives handleLives = new HandleLives(6);
    public static String chosenWord = getRandomSport().toLowerCase();
    public static List<Character> guessedCharacters = new ArrayList<>();


    public static void startGame() {
        HandleInstructions handleInstructions = new HandleInstructions();
        HandleInputs handleInputs = new HandleInputs();
        Scanner scanner = new Scanner(System.in);
        handleInstructions.printGreeting();
        handleInstructions.printInstructions();

        while (handleLives.getLives() != 0) {
            System.out.println("Word: " + displayWordWithGuesses());
            char guess = handleInputs.getCharInput(scanner);
            if (guessedCharacters.contains(guess)) {
                System.out.println("You've already guessed this letter, try another.");
                System.out.println("\n");
                continue;
            }
            if (chosenWord.contains(String.valueOf(guess))) {
                System.out.println("Good guess! The letter '" + guess + "' is in the word.");
                System.out.println("\n");
                guessedCharacters.add(guess);
                if (checkIfWon()) {
                    System.out.println("Congratulations ~(‾▿‾)~, you've won! The word was: " + chosenWord);
                    System.out.println("\n");
                    break;
                }
            } else {
                System.out.println("Oops! The letter '" + guess + "' is not in the word.");
                handleLives.loseLives();
                System.out.println("Lives remaining: " + handleLives.getLives());
                drawHangMan(handleLives.getLives());
                if (handleLives.getLives() == 0) {
                    System.out.println("Game over (╯°□°）╯︵ ┻━┻. The word was: " + chosenWord);
                }
            }

        }
    }

    public static boolean checkIfWon() {
        for (char c : chosenWord.toCharArray()
        ) {
            if (!guessedCharacters.contains(c)) {
                return false;
            }
        }
        return true;
    }

    public static String displayWordWithGuesses() {
        String display = "";
        for (char c : chosenWord.toCharArray()
        ) {
            if (guessedCharacters.contains(c)) {
                display += c;
            } else {
                display += "_ ";
            }
        }
        return display;
    }

}
