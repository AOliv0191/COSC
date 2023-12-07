import java.util.Scanner;

public class LowToHigh{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        
        boolean limit1;
        boolean limit2;
        boolean limit3;

        System.out.println("Provide a number between 10 and 30: ");
        double x = input.nextDouble();

        System.out.println("Provide a number between 10 and 30: ");
        double y = input.nextDouble();

        System.out.println("Provide a number between 10 and 30: ");
        double z = input.nextDouble();

        limit1 = x >= 10.0 && x <= 30.0;
        limit2 = y >= 10.0 && y <= 30.0;
        limit3 = z >= 10.0 && z <= 30.0;

        if (limit1 && limit2 & limit3){
            if((Math.abs(x - y) < 0.0001) && (Math.abs(x - z) < 0.0001) && (Math.abs(y - z) < 0.0001)){
                System.out.println("Multiple values identical");
            }
            else if ((x <= y) && (x <= z)){
                if (y <= z ){
                    System.out.println( x + ", " + y + ", " + z);
                }
                else{
                    System.out.println( x + ", " + z + ", " + y);
                }
            }
            else if ((y <= x) && (y <= z)){
                if (z <= x ){
                    System.out.println( y + ", " + z + ", " + x);
                }
                else{
                    System.out.println( y + ", " + x + ", " + z);
                }
            }
            else if ((z <= x) && (z <= y)){
                if (x <= y ){
                    System.out.println( z + ", " + x + ", " + y);
                }
                else{
                    System.out.println( z + ", " + y + ", " + x);
                }
            }
            
        }
        else{
            System.out.println("No valid input");
        }
    }
}

/* write a program that asks the computer user to enter three values
each of those values must be doubles between 10 and 30
the program shall find out the smallest and the largest of the three
display then using system.out.println();. if the three values are the asame, 
the program should display "multiple values identical*/