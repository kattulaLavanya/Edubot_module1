import java.util.Scanner;

public class AgeGuess {
    public static void main(String[] args) {
        //Scanner object
        Scanner scanner_obj = new Scanner(System.in);

        //variables
        String name;
        int ageGuess;

        System.out.print("Enter your name: ");
        name = scanner_obj.nextLine();
        System.out.print("Enter your age guess: ");
        ageGuess = scanner_obj.nextInt();

        // Display
        System.out.println("Name: " + name);
        System.out.println("Age Guess: " + ageGuess);

        scanner_obj.close();
    }
}

