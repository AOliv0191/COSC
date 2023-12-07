import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class FileProcessing{
    public static void main(String[]args) throws IOException{
        Scanner myFile = new Scanner(new File("numbers.txt"));
        int maxValue = Integer.MIN_VALUE;
        int minValue = Integer.MAX_VALUE;
        int sum = 0;
        int n = 0;//n total numbers
        double mean = 0;
        double sigma = 0;
        double sub;
        double pow;
        double k = 5.5;

        while(myFile.hasNextInt()){
            int x = myFile.nextInt(); //xi
            if(x > maxValue){
                maxValue = x;
            }

            if(x < minValue){
                minValue = x;
            }
            sum+=x;
            ++n;

            
            sigma+= Math.pow(x - k, 2);
        }
        mean = (double)sum/n; //x̄

        double frac = sigma/(n - 1);

        double stdev = Math.sqrt(frac);
        System.out.println("Smallest Value: " + minValue);
        System.out.println("Largest Value: " + maxValue);
        System.out.println("Mean: " + mean);
        System.out.print("Standard Deviation Calculation : ");
        System.out.printf("%.2f", stdev);
    }
}