import java.io.File;
import java.io.IOException;
import java.util.Scanner;


public class CountVowels{
    public static void main(String[]args) throws IOException{
        Scanner file = new Scanner(new File("input.txt"));
        int counter = 0;
        char letter;

        while(file.hasNextLine()){
            String s = file.nextLine();
            int i = s.length();
            for(int j = 0; j < i; j++){
                letter = s.charAt(j);
                switch(letter){
                    case 'a':
                    case 'A':
                    case 'e':
                    case 'E':
                    case 'i':
                    case 'I':
                    case 'o':
                    case 'O':
                    case 'u':
                    case 'U':
                    counter++;
                    break;
                }

            }
        }
        System.out.println("There are " + counter + " vowels.");
    }
}