
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class FileOperations{
    public static void main(String[]args) throws IOException{
        Scanner myFile = new Scanner(new File("numbers.txt"));
        int sum = 0;
        int counter = 0;
        int maxValue = Integer.MIN_VALUE;
        int minValue = Integer.MAX_VALUE;

        while(myFile.hasNextInt()){
            int x = myFile.nextInt();
            if(x > maxValue){
                maxValue = x;
            }

            if(x < minValue){
                minValue = x;
            }
            sum+=x;
            ++counter;
        }

        double avg = (double)sum/counter;

        PrintWriter pw = new PrintWriter("Results.txt");

        pw.println("Sum: " + sum);
        pw.println("MaX: " + maxValue);
        pw.println("Min: " + minValue);
        pw.println("Total: " + counter);
        pw.println("Average: " + avg);
        pw.close();
    }
}