public class MethodEx{
    public static void main(String[]args){
        int x = 5;
        int y = 2;

        //Call the method
        printSum(x,y);
    }
    public static void printSum(int x, int y){
        int result = x + y;
        System.out.println(result);
    }
}