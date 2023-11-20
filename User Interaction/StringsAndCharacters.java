import java.util.Scanner;

public class StringsAndCharacters {
    public static void main(String[]args){
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Str1: ");
            String str1 = input.nextLine();

            System.out.print("Str 2: ");
            String str2 = input.nextLine();

            System.out.print("Str3: ");
            String str3 = input.nextLine();

            char third1 = str1.charAt(2);
                String one = String.valueOf(third1);
            char third2 = str2.charAt(2);
                String two = String.valueOf(third2);
            char third3 = str3.charAt(2);
                String three = String.valueOf(third3);

            String answer = one.toUpperCase() + "." + two.toUpperCase() + "." + three.toUpperCase() +".";

            System.out.println(answer);
        }
    }
    
}
