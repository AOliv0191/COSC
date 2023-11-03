public class MySecondProgram {
    public static void main(String[]args){
        //Final draft starts here
            //Exercise 1
        String song = "Sugar";
        String band = "System Of A Down";

            //Exercise 2
        double radio = 106.7;
        int number = 7;

            //Exercise 3
        char third = song.charAt(2);
        System.out.println(third);

            //Exercise 4
        double sum = radio + number;
        System.out.println(sum);

            //Exercise 5
        char second = band.charAt(1);
        String two= String.valueOf(second);
        char first = band.charAt(0);

        System.out.println(first + two.toUpperCase() + band.substring(2));

            //Exercise 6
        int size = song.length();

        String a = String.valueOf(first);
        String b = two;
        String c = String.valueOf(radio);
        String d = String.valueOf(song.charAt(size-1));
        String e = String.valueOf(number);
        String f = "@";
            
        String password = a + b + c + d + e + f;
        System.out.println(password);

        //Final draft ends here

    }
}
