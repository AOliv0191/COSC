public class ArrayOperations {
    public static void main(String[] args){
        double [] array = {1.0, 2.0, 3.0, 4.0, 5.0, 6.0, 7.0, 8.0, 9.0, 10.0};

        System.out.println(array[0]);
        System.out.println(array[2]);
        System.out.println(array[9]);

        double sum = findSum(array);
        System.out.println("Sum is: " + sum);

        double avg = findAVG(array);
        System.out.println("Average is: " + avg);

        printReverse(array);
    }
    public static double findSum(double[] a){
        double sum = 0;
        
        for(int i = 0; i < a.length; i++){
            sum+=a[i];
        }
        return sum;
    }

    public static double findAVG(double[] a){
        double avg = 0;
        int index = 0;
        double sum = findSum(a);
        for(int i = 0; i < a.length; i++){
            index++;
        }

        avg = sum/index;

        return avg;
    }

    public static void printReverse(double[] a){
        for(int i = a.length - 1; i >= 0; i--){
            System.out.print(a[i] + " ");
        }
    }
}
