public class CelsiusTable {
    public static void main(String[]args){
        for(int i = 0; i <=20; i++){
            double fahrenheit = Double.valueOf(i) ;
            double c = celsius(fahrenheit);
            
            System.out.print(fahrenheit + " F is ");
            System.out.printf("%.2f C \n", c);
        }
    }
    public static double celsius(double fahrenheit){
        double holder = (fahrenheit - 32);
        double c = (holder * 5) / 9;
        return c;
    }
}
