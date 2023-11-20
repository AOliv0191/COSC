import java.util.Scanner;

public class CheckForTemp2 {
    public static void main(String[]args){
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Please provide temperature: ");
            int temperature = input.nextInt();

            if(temperature >= 80){
                if(temperature >= 110){
                    System.out.println("Do not go outside... too hot");
                }
                else{
                    System.out.println("Wear shorts and t-shirts");
                }
            }
   
            else{
                if(temperature <= 30){
                    System.out.println("Do not go outside... too cold");
                }
                else{
                    System.out.println("Wear jeans and jacket");
                }
            }
        }
    }
}