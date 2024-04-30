public class RecursiveMethod {
    public static void main(String[] args) {
        for(int i = 0; i < 5; ++i){
            System.out.println("Hello World");
        }

        printHello(15);
    }

    public static void printHello(int u){
        
        if(u > 1){
            printHello(u-1);
        }

        if(u % 4 == 0){
            System.out.println("How low?");
        }
        else{
            System.out.print("Hello, ");
        }
    }
}
