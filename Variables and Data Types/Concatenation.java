public class Concatenation {
    public static void main(String[]args){
        //Exercise 1
        String month = "September";
        String day = "Friday";
        String major = "COMPUTER SCIENCE";

        //Exercise 2
        System.out.println("Today is " + month + ", of 2023. The day is " + day + ". Our study major is " + major );

        //Exercise 3
        int size1 = month.length();
        int size2 = day.length();
        int size3 = major.length();

        int totalSize = size1 + size2 + size3;

        System.out.println("The total number of characters is : " + totalSize);

        //Exercise 4
        String firstName = "akari".toUpperCase();
        String lastName = "olivares".toUpperCase();

        char initialFirst = firstName.charAt(0);
        char initialLast = lastName.charAt(0);

        System.out.println(initialFirst + "." + initialLast + ".");
    }
}
