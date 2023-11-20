import java.util.Scanner;

public class CoffeeMachineUsingSwitchString{
    public static void main(String[]args){
        try (Scanner input = new Scanner(System.in)) {

            System.out.println("Welcome to the Coffee Machine");
            System.out.println("Select an option");
            System.out.println("1: Espresso");
            System.out.println("2: Americano");
            System.out.println("3: Vanilla Coffee");
            System.out.println("4: Mocha");

            String choice = input.nextLine().toLowerCase();

            switch(choice){
                case "espresso":
                    System.out.println("Brewing Espresso");
                    break;
                case "americano":
                    System.out.println("Brewing Americano");
                    break;
                case "vanilla coffee":
                    System.out.println("Brewing Vanilla Coffee");
                    break;
                case "mocha":
                    System.out.println("Brewing Mocha");
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}