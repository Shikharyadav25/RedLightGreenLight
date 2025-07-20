import java.util.Random;

public class Basic {
    public static void main(String[] args) {
        Random rnd = new Random();
        System.out.println("Welcome to Squid Game!");
        int num = rnd.nextInt(1, 457); // 1 to 456 inclusive

        System.out.println("You are player number " + num);
        System.out.println("Your first game is Red Light, Green Light.\nYou have to reach the finish line in less than 10 steps.");

        for (int i = 1; i <= 10; i++) {
            boolean steps = rnd.nextInt(100) < 80; // 80% chance of survival per step
            if (steps) {
                System.out.println("Step " + i + ": Survives");
            } else {
                System.out.println("Step " + i + ": Player number " + num + " eliminated");
                break;
            }
        }
        System.out.println("--GAME OVER--");
    }
}