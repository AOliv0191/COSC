import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandling{
    public static void main(String[] args){
        try (Scanner scnr = new Scanner(System.in)) {
            double result = 0.0;
            try{
                System.out.println("Please provide 1st number: ");
                int num1 = scnr.nextInt();
                System.out.println("Please provide 2nd number: ");
                int num2 = scnr.nextInt();
                result = num2/num1;
            }
            catch(ArithmeticException arremangala){
                System.out.println("You cannot divide by 0.");
            }
            catch(InputMismatchException arrepungala){
                System.out.println("This is not a number...");
            }
            //general error
            catch(Exception chipiChipi){
                System.out.println("Something went wrong..."); 
            }
            
            finally{
            System.out.println("Result " + result);
            }
        }
    }
}