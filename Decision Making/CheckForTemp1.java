import java.util.Scanner;

public class CheckForTemp1 {
    public static void main(String[]args){
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Please provide temperature: ");
            int temperature = input.nextInt();

            if(temperature >= 80){
                System.out.println("Oh my, it's hot outside");
            }
            else{
                System.out.println("Oh my, it's cold outside");
            }
        }
    }
}
