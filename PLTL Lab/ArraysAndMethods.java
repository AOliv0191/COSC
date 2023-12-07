import java.util.Scanner;
public class ArraysAndMethods {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the total number of scores: ");
        int numberScores = input.nextInt();

        int[] scores = new int[numberScores];

        for(int i = 0; i < numberScores; ++i){
            System.out.print("Score: ");
            scores[i] = input.nextInt();
        }

        print(scores);

        double avg = getAVG(scores);
        System.out.println("Average grade: " + avg); //check mean grader

        char grade = getGradeByAVG(avg);
        System.out.println("Letter grade: " + grade);

        int maxScore = findMax(scores);
        System.out.println("Highest score: " + maxScore);
    }
    public static void print(int[] array){
        System.out.print("Scores: ");

        for(int i = 0; i < array.length; ++i){
            for(int f = (array.length) - 1 ; i < f; ++i){
                System.out.print(array[i] + ", ");
            }
            System.out.println(array[i]);
        }
    }
    public static double getAVG(int[] array){
        double sum = 0;
        for(int i = 0; i < array.length; ++i){
            sum += array[i];
        }
        System.out.println("Sum: " + sum);

        double avg = sum / array.length;

        return avg;
    }
    public static char getGradeByAVG(double average){
        if(average < 60.0){
            return 'F';
        }
        else if(average < 70.0){
            return 'D';
        }
        else if(average < 80.0){
            return 'C';
        }
        else if(average < 90.0){
            return 'B';
        }
        else{
            return 'A';
        }
    }
    public static int findMax(int[] array){
        int maxValue = array[0];

        for(int i = 0; i < array.length; ++i){
            if(maxValue < array[i]){
                maxValue = array[i];
            }
        }

        return maxValue;
    }
}
