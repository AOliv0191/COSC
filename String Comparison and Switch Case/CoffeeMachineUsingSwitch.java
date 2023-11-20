import java.util.Scanner;

public class CoffeeMachineUsingSwitch{
    public static void main(String[]args){
        try (Scanner input = new Scanner(System.in)) {

            System.out.println("Welcome to the Coffee Machine");
            System.out.println("Select an option");
            System.out.println("1: Espresso");
            System.out.println("2: Americano");
            System.out.println("3: Vanilla Coffee");
            System.out.println("4: Mocha");

            int choice = input.nextInt();

            switch(choice){
                case 1:
                    System.out.println("Brewing Espresso");
                    break;
                case 2:
                    System.out.println("Brewing Americano");
                    break;
                case 3:
                    System.out.println("Brewing Vanilla Coffee");
                    break;
                case 4:
                    System.out.println("Brewing Mocha");
                    break;
                default:
                    System.out.println("Invalid choice number... Please select from 1 to 4.");
            }
            System.out.println("Ready to go");
        }
    }
}