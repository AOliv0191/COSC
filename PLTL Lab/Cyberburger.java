import java.util.Scanner;

public class Cyberburger{
    public static void main(String [] args){
        Scanner intScanner = new Scanner(System.in);
        Scanner stringScanner = new Scanner(System.in);
        
        String order = "";
        String cheese = "";
        double amount = 0.0;
        double tax;

        System.out.println("============== CyberBurger Menu ==============");
        System.out.println("(1) CyberBurger");
        System.out.println("(2) Double Meat CyberBurger");
        System.out.println("(3) Triple Meat CyberBurger");
        System.out.println("(4) Jalapeno and Cheese");
        System.out.println("(5) Bacon and Cheese");
        System.out.println("(6) Salad");
        System.out.println("==============================================");

        System.out.println("Enter the menu item that you want: ");
        int menu = intScanner.nextInt();

        switch(menu){
            case 1:
                order = "CyberBurger";
                amount = 3.99;
                break;
            case 2:
                order = "Double Meat CyberBurger";
                amount = 4.99;
                break;
            case 3:
                order = "Triple Meat CyberBurger";
                amount = 5.99;
                break;
            case 4:
                order = "Jalapeno and Cheese";
                amount = 6.99;
                break;
            case 5:
                order = "Bacon and Cheese";
                amount = 7.99;
                break;
            case 6:
                order = "Salad";
                amount = 8.99;
                break;
            default:
                System.out.println("Sir, This Is A CyberBurger's");
        }

        if (((menu >= 1) && (menu <=3)|| menu ==6)){
            System.out.println("Would you like cheese with that? (yes/no)");
            cheese = stringScanner.nextLine();
            if (cheese.equalsIgnoreCase("yes")){
                amount = amount + 0.50;
                tax = (8.25 * amount)/100;
                amount = amount + tax;

                System.out.print("Your order is " + order +
                " with cheese. Your total is $");
                System.out.printf("%.2f", amount);
            }
            else if (cheese.equalsIgnoreCase("no")){
                tax = (8.25 * amount)/100;
                amount = amount + tax;

                System.out.print("Your order is " + order +
                ". Your total is $");
                System.out.printf("%.2f", amount);
            }
        }
        else if((menu == 4) || (menu == 5)){
            tax = (8.25 * amount)/100;
            amount = amount + tax;

            System.out.print("Your order is " + order +
                ". Your total is $");
            System.out.printf("%.2f", amount);
        }
    }
}