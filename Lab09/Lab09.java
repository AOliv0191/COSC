import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Lab09 {
    public static void main(String[] args) throws IOException{
        Scanner myFile = new Scanner(new File("numbers.txt"));
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        //ArrayList<Integer> to convert it to a int[]

        while(myFile.hasNextInt()){
            int holder = myFile.nextInt();
            numbers.add(holder);
        }
        
        int value = numbers.size();

        int[] array = new int[value];

        //Assigns each value of the int[] with the values of the Integers
        for(int i = 0; i < array.length;++i){
            int holder = numbers.get(i);
            array[i] = holder;
        }

        System.out.print("Write the name for the file (.txt is not necessary): ");
        String name = input.nextLine();
        name = name.concat(".txt");
        writeToFile(name, array);
    }

    /**
     * Takes an array of ints,
     * and return the sum of the numbers in the array
     * @param a the array of ints
     * @return an integer that represents the sum of arrays
     */
    public static int getSum(int[] a){
        int sum = 0;
        for(int i = 0; i < a.length; ++i){
            sum += a[i];
        }
        return sum;
    }

    /**
     * Takes an array of ints,
     * return the average of the array
     * @param a the array of ints
     * @return a double representing the average of the arrays
     */
    public static double getAVG(int[] a){
        int sum = getSum(a);
        int length = a.length;

        double avg = (double)sum/length;

        return avg;
    }

    /**
     * Takes an array of ints,
     * return the largest value of the numbers in the array
     * @param a the array of ints
     * @return an integer representing the larger value of the array
     */
    public static int getMax(int[] a){
        int maxValue = a[0];

        for(int i = 0; i < a.length; ++i){
            if(maxValue < a[i]){
                maxValue = a[i];
            }
        }

        return maxValue;
    }

    /**
     * Takes an array of ints,
     * return the smallest value of the numbers in the array
     * @param a the array of ints
     * @return an integer representing the smallest value of the array
     */
    public static int getMin(int[] a){
        int minValue = a[0];

        for(int i = a.length - 1; i > 0; --i){
            if(minValue > a[i]){
                minValue = a[i];
            }
        }

        return minValue;
    }
    
    /**
     * Takes an array of ints,
     * return the standard deviation of the array
     * @param a the array of ints
     * @return a double representing the standard deviation
     */
    public static double getStdDev(int[] a){
        int n = a.length;
        double mean = getAVG(a);
        double sigma = 0;

        for(int i = 0; i < a.length; ++i){
            sigma+=Math.pow(a[i] - mean, 2);
        }
        
        double frac = sigma/(n - 1);
        double stdev = Math.sqrt(frac);

        return stdev;
    }
    
    /**
     * Takes an String for the name, and an array of ints
     * Creates a file that will contain:
     *  -The sum of the numbers in the array
     *  -The average of the numbers in the array
     *  -The largest value in the array
     *  -The minimum value in the array
     *  -The standard deviation of the array
     * @param fileName name of the file that is going to be created
     * @param a the array of ints
     * @throws IOException
     */
    public static void writeToFile(String fileName, int[] a)throws IOException{
        PrintWriter pw = new PrintWriter(fileName);
        pw.println("Sum: " + getSum(a));
        pw.println("Average: " + getAVG(a));
        pw.println("Largest value: " + getMax(a));
        pw.println("Smallest value: " + getMin(a));
        pw.println("Standard deviation: " + getStdDev(a));
        pw.close();
    }
}