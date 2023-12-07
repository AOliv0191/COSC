public class ArgsProcessor{
    public static void main(String[]a){
        System.out.println("Total size: " + a);
        
        if(a.length < 0){
            System.out.println("Nothing to process");
        }
        else{
            int x = a[0];
            int y = a[1];
            int z = x + y;
            System.out.println("The sum is: " + z);
        }
    }
}