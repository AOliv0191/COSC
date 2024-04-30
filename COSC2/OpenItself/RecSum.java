public class RecSum {
    /*Create a method named getSum.
     * This method will take an int n as a parameter and
     * return the sum of all digits of n.
     * 
     * For example, if n is 5, the method should return 15 (5+4+3+2+1+0 = 15)
     * 
     * Create an iterative method (using for or while),
     * then transform it to the recursive method. 
     * One of the recursive methods should be direct(linear), and second tail rescursive methods
     */
    public static void main(String[] args) {
        System.out.println(getSum(5));
        System.out.println(getSum_Rec1(5));
        System.out.println(getSum_Rec2(5));

        int [] a = {0, 1, 2, 3, 4, 5};
        System.out.println(getSum_Rec3(a, 0));

    }

    public static int getSum(int n){
        int totalSum = 0;
      
        for(int i = 0; i <= n; ++i){
            totalSum += i;
        }

        return totalSum;
    }

    public static int getSum_Rec1(int n){
        if(n == 0){
            return 0;
        }
        else{
            return n + (getSum(n-1));
        }
    }

    public static int getSum_Rec2(int n){
        if(n > 0){
            return n + getSum_Rec2(n-1);
        }
        return 0;
    }

    public static int getSum_Rec3(int[] a, int i){
        if(i < a.length){
            return a[i] + getSum_Rec3(a, i+1);
        }
        else{
           return 0;
        }
        
    }
}
