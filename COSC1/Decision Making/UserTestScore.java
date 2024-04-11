import java.util.Scanner;

public class UserTestScore {
    public static void main(String[]args){
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Tell me the score that you got on the test:");
            double testScore = input.nextDouble();

            if(testScore <=60.0){
                if(testScore ==0.0){
                    System.out.println("Your grade is F.");
                    System.out.println("Wow... how do you even fail this hard?");
                }
                else{
                    System.out.println("Your grade is F.");
                    System.out.println("Congratulations, you are a failure and you better get used to it.");
                }
            }
            else if(testScore >60.0){
                if(testScore <=70.0){
                    System.out.println("Your grade is D.");
                    System.out.println("Don't brag about it, though. You're still almost a failure.");
                }
                else if(testScore <=80.0){
                    System.out.println("Your grade is C.");
                    System.out.println("Well, only half of you is a failure.");
                }
                else if(testScore <=90.0){
                    System.out.println("Your grade is B.");
                    System.out.println("How does it feel being the failure of second place, uh?");
                }
                else if(testScore <=99.9){
                    System.out.println("Your grade is A.");
                    System.out.println("Common men, it's an A. Don't argue with your teacher for some points.");
                }
                else if(testScore >=100.0){
                    System.out.println("Your grade is a perfect A.");
                    System.out.println("Wow, you really do not have friends... do you?");
            }
            }
        }

    }
}
