import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class RemedialActivity2 {
    public static void main(String[] args) throws IOException{
        Scanner input = new Scanner(new File("numbers.txt"));
        int total = input.nextInt();
        int[] array = new int[total];
        int position = 0;
        
        while(input.hasNext()){
            int number = input.nextInt();
            array[position] = number;
            position++;
        }
    }
}
