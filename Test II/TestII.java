import java.util.Scanner;

public class TestII{
    public static void main(String[]args){
        try (Scanner input = new Scanner(System.in)) {
            int number = input.nextInt();
            int sum = 0;

            while(number != (-99)){
                sum+=number;
                number = input.nextInt();
            }
            System.out.println("Sum is: " + sum);
        }
    }
}