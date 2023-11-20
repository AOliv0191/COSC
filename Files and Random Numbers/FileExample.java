import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class FileExample{
    public static void main(String[]args) throws IOException{
        Scanner myFile = new Scanner(new File("numbers.txt"));
        int sum = 0;

        while(myFile.hasNextInt()){
            int num = myFile.nextInt();
            sum+=num;
            System.out.println(num);
        }
        System.out.println("Sum: " + sum);
    }
}