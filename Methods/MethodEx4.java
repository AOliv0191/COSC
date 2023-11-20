public class MethodEx4 {
    public static void main(String[]args){

        //Call the method
        //make sure that input are correspondant
        printSum(5,2);
        int sum = getSum(6,6);

        System.out.println("Sum: " +sum);
    }
    public static void printSum(int x, int y){
        int result = x + y;
        System.out.println(result);
    }

    public static int getSum(int x, int y){
        int result = x + y;
        return result;
        // return x+y; also works
    }
}
