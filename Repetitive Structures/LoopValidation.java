import java.util.Scanner;

public class LoopValidation{
    public static void main(String[]args){
        Scanner scnr = new Scanner(System.in);
        
        int n;
        boolean flag = false;

        do{
            System.out.println("Provide a number from 0 to 10: ");
            n = scnr.nextInt();
            if ((n >= 0) && (n <= 10)){
                flag = true;
                System.out.println("Thank you for input " + n + ", have a nice day.");
            }
            
        }while(!flag);
        
    }
}