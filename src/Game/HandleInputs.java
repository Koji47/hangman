package Game;

import java.util.Scanner;

public class HandleInputs {
    public char getCharInput (Scanner scanner) {
        char input;
        while (true) {
            System.out.println("Enter a letter: ");
            String userInput = scanner.nextLine();
            if(userInput.length() == 1 && Character.isLetter(userInput.charAt(0))) {
                input = userInput.charAt(0);
                break;
            } else
                System.out.println("Invalid input. Please enter a single character.");

        }
        return input;
    }
}
