import java.util.Scanner;

public class LoopInteraction{
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Provide a number: ");
        int n = input.nextInt();

        input.nextLine();

        System.out.println("What is your name?");
        String name = input.nextLine();

        System.out.println("n: " + n);

        System.out.println("Name: " + name);

        System.out.print("for: ");

        for(int i = 0; i < n; ++i){
            for(int f = n - 1; i < f; i++){
                System.out.print(name + ", ");
            }
            System.out.println(name);
        }

        System.out.print("while: ");
        int i = 0;
        while (i < n){
            while(i < n -1){
                System.out.print(name + ", ");
                i++;
            }
            System.out.println(name);
            i++;
        }

        System.out.print("do while: ");
        i = 0;
        do{
            do{
                System.out.print(name + ", ");
                i++;
            }while(i < n - 1);
            System.out.println(name);
            i++;
        }while(i < n);
    }
}