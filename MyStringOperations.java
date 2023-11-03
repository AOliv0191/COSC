public class MyStringOperations {
    public static void main(String[]args){
        String word = "pRoGrAmMiNg iS, FuN?";
        System.out.println(word);

        int size = word.length();
        System.out.println(size);

        System.out.println(word.toLowerCase());

        String up= word.toUpperCase();
        System.out.println(up);

        char first = word.charAt(0);
        System.out.println("The first letter is " + first);

        char second = word.charAt(1);
        System.out.println("The first letter is " + second);

        char last = word.charAt(size - 1);
        System.out.println("The last letter is " + last);
    }
}
