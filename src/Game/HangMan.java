package Game;

public class HangMan {
    public static void drawHangMan(int lives){
        if (lives == 6){
            System.out.println("\n");
            System.out.println("__|______");
            System.out.println(" ");
        }
        if (lives == 5){
            System.out.println("\n");
            System.out.println("  ________________");
            System.out.println("  |");
            System.out.println("  |");
            System.out.println("  |");
            System.out.println("  |");
            System.out.println("  |");
            System.out.println("  |");
            System.out.println("__|______");
            System.out.println(" ");
        }
        if (lives == 4){
            System.out.println("\n");
            System.out.println("  ________________");
            System.out.println("  |           |");
            System.out.println("  |        ( ಠ_ಠ)");
            System.out.println("  |");
            System.out.println("  |");
            System.out.println("  |");
            System.out.println("  |");
            System.out.println("__|______");
            System.out.println(" ");
        }
        if (lives == 3){
            System.out.println("\n");
            System.out.println("  ________________");
            System.out.println("  |           |");
            System.out.println("  |        ( ಠ_ಠ)");
            System.out.println("  |         (  )");
            System.out.println("  |");
            System.out.println("  |");
            System.out.println("  |");
            System.out.println("__|______");
            System.out.println(" ");
        }
        if (lives == 2){
            System.out.println("\n");
            System.out.println("  ________________");
            System.out.println("  |           |");
            System.out.println("  |        ( ಠ_ಠ)");
            System.out.println("  |         (づ )づ");
            System.out.println("  |");
            System.out.println("  |");
            System.out.println("  |");
            System.out.println("__|______");
            System.out.println(" ");
        }
        if (lives == 1){
            System.out.println("\n");
            System.out.println("  ________________");
            System.out.println("  |           |");
            System.out.println("  |        ( ಠ_ಠ)");
            System.out.println("  |         (づ )づ");
            System.out.println("  |          / |");
            System.out.println("  |");
            System.out.println("  |");
            System.out.println("__|______");
            System.out.println(" ");
        }

        if (lives == 0){
            System.out.println("\n");
            System.out.println("  ________________");
            System.out.println("  |           |");
            System.out.println("  |        ( x_x)");
            System.out.println("  |         (づ )づ");
            System.out.println("  |          / |");
            System.out.println("  |");
            System.out.println("  |");
            System.out.println("__|______");
            System.out.println(" ");
        }
    }
}
