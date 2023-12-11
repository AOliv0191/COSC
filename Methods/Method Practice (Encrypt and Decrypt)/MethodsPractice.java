public class MethodsPractice{
    public static void main(String[]args){
        showChar("New York", 2);

    }
    public static void showChar(String text, int index){
        System.out.println(text.charAt(index));
    }
    /*Create a program named MethodsPractice and write the following method:
     * Write a method name showChar. The method should accept two arguments:
     * A String and an integer. The integer argument is a character
     * position within the String, with the first character being at index 0.
     * When the method executes, it should display the character at that position
     * Example: showChar("New York",2); will display the character w.
    */
}