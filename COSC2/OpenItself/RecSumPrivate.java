public class RecSumPrivate {
    public static void main(String[] args) {
        int[] a = {2, 7, 10, 5, 6};

        System.out.println("Sum: " + getSum(a));
    }
    public static int getSum(int[] a){
        return getSum_Rec(a, 0);
    }

    //Helper method
    private static int getSum_Rec(int[] a, int i){
        if(i < a.length){
            return a[i] + getSum_Rec(a, i+1);
        }
        else{
           return 0;
        }
        
    }
}
