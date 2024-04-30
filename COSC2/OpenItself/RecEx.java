public class RecEx {
    public static void main(String[] args) {
        String s = "Hello";
        int n = 0;

        printRec(s, n);
    }

    public static void printIter(String s, int n){
        for(int i = 0; i < n; ++i){
            System.out.println(s);
        }
    }

    public static void printIter2(String s, int n){
        int i = 0;
        while(i < n){
            System.out.println(s);
            ++i;
        }
    }

    public static void printRec(String s, int n){
        int i = 5;
        if(i < n){
            System.out.println("Stop...");
        }
        else{
            printRec(s, n + 1);
            System.out.println(s);
            
        }
    }
    
}
