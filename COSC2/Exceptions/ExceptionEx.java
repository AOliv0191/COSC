import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionEx {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        try{
            System.out.println("Provide 1st number: ");
            int x = scnr.nextInt();

            System.out.println("Provide 2nd number: ");
            int y = scnr.nextInt(); 

            System.out.println("Result: " + division(x, y));
        }
        catch(NoTwosAllowed e){
            System.out.println(e);
        }
        catch(ArithmeticException a){
            System.out.println("You still can't divide by 0");
        }
        catch(InputMismatchException i){
            System.out.println("Don't try to play smart, that is not a number");
        }
        catch(Exception o){
            System.out.println("It looks that something bad happens...");
        }
        
    }

    public static double division(int x, int y)throws NoTwosAllowed{
        if(y == 2){
            throw new NoTwosAllowed("I don't want to divide by 2... try other number");
        }
        return x/y;
    }
}
