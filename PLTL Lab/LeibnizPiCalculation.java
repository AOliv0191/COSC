import java.util.Scanner;
public class LeibnizPiCalculation {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();

        System.out.println("N \t\t Pi");
        System.out.println("---------------------");

        for(int i = 0; i <=  n; i+=100){
            System.out.println(i + "\t\t" + getLeibniz(i));
        }
    }
    public static double getLeibniz(int n){
        int sigma = 0;
        for(int k = 0; k <= n; k++){
            sigma += (4 * getNumerator(k))/getDenominator(k);
        }
        return sigma;
    }
    public static double getNumerator(int k){
        double num = Math.pow(-1, k);
        return num;
    }
    public static int getDenominator(int k){
        int den = (2*k) + 1;
        return den;
    }
}