public class RecursionEx {
    public static void main(String[] args) {
        //recursionHello(5, 0);
        recursion2Hello(5);
    }
    public static void recursionHello(int n, int i){
        if(i < n){
            recursionHello(n, i+1);
            System.out.println("Hello");
        }
    }

    public static void recursion2Hello(int n){
        if (n == 0) {
            System.out.println("Done...");
        }
        else{
            recursion2Hello(n-1);
            System.out.println("Hello");
        }
    }
}
