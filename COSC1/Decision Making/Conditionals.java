import java.util.Scanner;

public class Conditionals{
    public static void main(String[]args){
        try(Scanner input = new Scanner(System.in)){

            System.out.println("Provide an integer number:");
            int number1 = input.nextInt();
            System.out.println("Provide another integer number:");
            int number2 = input.nextInt();

            if(number1 < number2){
                System.out.println(number1 + ", " + number2);

            }
            else{
                System.out.println(number2 + ", " + number1);
            }
        }
    }
}
