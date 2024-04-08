public class ArrayEx{
    public static void main(String[]args){
        int []array = {5, 4, 6, 2, 1};
        int sum = getSum(array);
        
        print(array);
        System.out.println("Sum: " + sum);
    }
    public static void print(int [] array){
        for(int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
    public static int getSum(int []array){
        int sum = 0;
        for(int i = 0; i < array.length; i++){
            sum += array[i];
        }
        return sum;
    }
}
