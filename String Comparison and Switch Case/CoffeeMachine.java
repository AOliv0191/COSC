import java.util.Scanner;

public class CoffeeMachine{
    public static void main(String[]args){
        try (Scanner input = new Scanner(System.in)) {

            System.out.println("Welcome to the Coffee Machine");
            System.out.println("Select an option");
            System.out.println("1: Espresso");
            System.out.println("2: Americano");
            System.out.println("3: Vanilla Coffee");
            System.out.println("4: Mocha");

            int choice = input.nextInt();

            if (choice == 1){
                System.out.println("Brewing Espresso");
            }
            else if (choice == 2){
                System.out.println("Brewing Americano");
            }
            else if (choice == 3){
                System.out.println("Brewing Vanilla Coffee");
            }
            else if (choice == 4){
                System.out.println("Brewing Mocha");
            }
            else{
                System.out.println("Invalid choice number... Please select from 1 to 4.");
            }
        }
    }
}