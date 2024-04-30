public class Recursion {
    public static void main(String[] args) {
        
        System.out.println("printReverseIter(): ");
        printReverseIter(5);

        System.out.println("printReverseRec(): ");
        printReverseRec(5);

        System.out.println("Irerative-based getSum(): ");
        System.out.println(getSumIter(5));

        System.out.println("Recursive-based getSum(): ");
        System.out.println(getSumRec(5));

        System.out.println("printReverse(): ");
        printReverse("Computer", 0);
    }

    public static void printReverseIter(int n){
        int i;
        for(i = n; i > 0; --i){
            System.out.print(i + ", ");
        }
        System.out.println(i);
    }

    public static void printReverseRec(int n){
        if(n > 0){
            System.out.print(n + ", ");
            printReverseRec(n - 1);
        }
        else{
            System.out.println(n);
        }
    }

    public static int getSumIter(int n){
        int totalSum = 0;
      
        for(int i = 0; i <= n; ++i){
            totalSum += i;
        }

        return totalSum;
    }

    public static int getSumRec(int n){
        if(n == 0){
            return 0;
        }
        else{
            return n + (getSumRec(n-1));
        }
    }

    public static void printReverse(String s, int i){
        if(i == s.length()){
            System.out.print("");
        }
        if(i < s.length()){
            printReverse(s, i + 1);
            System.out.print(s.charAt(i));
        }
    }
}
