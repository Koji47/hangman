package Game;

public class HandleInstructions {

    public void printGreeting() {
        System.out.println("(づ ￣ ³￣)づ          Welcome to Hangman (Sports)          ლ(ಠ益ಠ)ლ");
        System.out.println("\n");
    }

    public void printInstructions(){
        System.out.println("Instructions:");
        System.out.println("Type a letter and press enter,");
        System.out.println("If you guess correctly, the letter will appear,");
        System.out.println("If you guess incorrectly, you will lose a life, good luck (╭ರ_•́)");
        System.out.println("\n");
    }

    public void printWin(){
        System.out.println("\n");
        System.out.println("  ________________");
        System.out.println("  |           |");
        System.out.println("  |");
        System.out.println("  |");
        System.out.println("  |           ^ ");
        System.out.println("  |        ( ಠ_ಠ)  Thank You for saving me <3");
        System.out.println("  |         (づ )づ");
        System.out.println("__|______    / |");
        System.out.println(" ");
    }
}
