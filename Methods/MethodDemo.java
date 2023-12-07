import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class MethodDemo {
    public static void main(String[]args) throws IOException{
        encrypt("input.txt");
        decrypt("transformation.txt");
    }

    public static void encrypt(String filename) throws IOException{
        Scanner myFile = new Scanner(new File(filename));

        PrintWriter pw = new PrintWriter("transformation.txt");
        while(myFile.hasNextLine()){
            String s = myFile.nextLine();

            for(int i = 0; i<s.length(); ++i){
                pw.print(findUnicodeValue(s.charAt(i)));
                pw.print(" ");
            }
            pw.println();
        }
        pw.close();
    }

    public static int findUnicodeValue(char letter){
        return (int)letter;
    }


    public static void decrypt(String filename) throws IOException{
        Scanner myFile = new Scanner(new File(filename));

        PrintWriter pw = new PrintWriter("decrypt.txt");

        while(myFile.hasNextInt()){
            int x = myFile.nextInt();
            char letter = returnValue(x);
            pw.print(letter);
            
        }
        pw.close();
    }

    public static char returnValue(int letter){
        return(char)letter;
    }
}
