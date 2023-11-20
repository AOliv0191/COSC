//1. import the Scanner Library
import java.util.Scanner;

public class UserInteraction {
    public static void main(String[]args){
        //2. Create a Scanner object
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("What is your name?");
            String name = input.nextLine(); //to read a String

            System.out.println("What is your favorite food?");
            String food = input.nextLine(); //to read a String

            System.out.println("What is your age?");
            int age = input.nextInt(); //to read a Integer

            int year = 2023 - age;

            System.out.println("Please to meet you, " + name + ". I also like " + food + "!!!. I bet you were born on " + year 
            + ", eh?");
        }

    }
}