import java.util.Scanner;

public class DistanceConvertor {
    public static void main(String[]args){
        try (Scanner input = new Scanner(System.in)) {
            double distance;
            int choice;
            System.out.print("Enter a distance in meters: ");
            distance = input.nextDouble();
            while (distance < 0.00000000000001){
                System.out.print("Invalid distance. Enter another one again: ");
                distance = input.nextDouble();
            }

            menu();
            choice = input.nextInt();
            
            while (choice != 4){
                switch (choice) {
                    case 1:
                        showKilometers(distance);
                        menu();
                        choice = input.nextInt();
                        break;
                    case 2:
                        showInches(distance);
                        menu();
                        choice = input.nextInt();
                        break;
                    case 3:
                        showFeet(distance);
                        menu();
                        choice = input.nextInt();
                        break;
                    default:
                        System.out.print("Error, invalid choice. Insert choice again: ");
                        choice = input.nextInt();
                        break;
                }
            }
        }
    }
    public static void menu(){
        System.out.println("1. Convert to kilometers");
        System.out.println("2. Convert to inches");
        System.out.println("3. Convert to feet");
        System.out.println("4. Quit the program");
        System.out.printf("\n");
        System.out.print("Enter your choice: ");
    }
    public static void showKilometers(double meters){
        double kilometers = meters * 0.001;
        System.out.println(meters + " meters is " + kilometers + " kilometers.");
    }
    public static void showInches(double meters){
        double inches = meters * 39.97;
        System.out.println(meters + " meters is " + inches + " inches.");
    }
    public static void showFeet(double meters){
        double feet = meters * 3.281;
        System.out.println(meters + " meters is " + feet + " feet.");
    }
}
