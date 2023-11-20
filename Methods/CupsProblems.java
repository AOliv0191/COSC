import java.util.Scanner;
public class CupsProblems{
    public static void main(String[]args){
        double numOfCups = getCups();
        
        double ounces = 0.0;
        
        ounces = cupsToOunces(numOfCups);

        displayResults(numOfCups, ounces);
    }
    public static double getCups(){
        Scanner input = new Scanner(System.in);

        System.out.println("Please provide number of cups: ");
        double cups = input.nextDouble();

        return cups;
    }
    public static double cupsToOunces(double numOfCups){
                
        double ounces = 8 * numOfCups;

        return ounces;
    }
    public static void displayResults(double numOfCups, double ounces){
        System.out.println(numOfCups + " cups are equal to " + ounces + " fluid ounces.");
    }
}