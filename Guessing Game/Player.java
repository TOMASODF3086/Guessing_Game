import java.util.Scanner;

public class Player {
    int number; // Instance variable to hold the player's guess

    public void guess() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a guess: ");
        number = input.nextInt(); // Read the player's guess from the console
        
    }
}
