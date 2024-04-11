import java.util.Scanner;

public class DecisionEx {
    public static void main(String[]args){
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Prize: ");
            int prize = input.nextInt();

            if(prize == 1){
                System.out.println("Get a candy");
            }
            else if(prize == 1000){
                System.out.println("Go to Disney World");
            }
            else{
                System.out.println("Oops... maybe next time...");
            }
        }

    }
}
