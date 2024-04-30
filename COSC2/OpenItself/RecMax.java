public class RecMax {
    /*Write a method called findMax()
     * This method will take at least 1D array as a parameter
     * and return the largest element in the array.
     * 
     * Create a public and a private method if you have more than one parameter
     * 
     * *********************************
     * Write a method called printReverse()
     * This method will take at least a String as a parameter
     * The method will print the String backwards
     * *************
     * Write a method called countOnlyOdd.
     * The method will process an array of ints.
     * The method shall count and return the total number of
     * odd values in the array.
     *  And odd number is a number that is not divisible by 2, i.e.
     * if the reminder of the number by 2 is not 0.
     * Ex:
     * a = {4, 5, 3, 7, 6, 1, 4, 2, 0 , 3, 6, 5, 3, 96};
     * There are 7 odd numbers: 5, 3, 7, 1, 3, 5 and 3
     * Write a public method the takes the array as a param only
     * Write a private method that takes any additional params
     */

    public static int findMax(int[] a){
        return findMax(a, 0, Integer.MIN_VALUE);
    }
    private static int findMax(int[] a, int i, int largest){
        if(i == a.length){
            return largest;
        }
        if(largest < a[i]){
            largest = a[i];
        }
        return findMax(a, i + 1, largest);
    }
    
    private static void printReverse(String s, int i){
        if(i == s.length()){
            System.out.print("");
        }
        if(i < s.length()){
            printReverse(s, i + 1);
            System.out.print(s.charAt(i));
        }
    }

}
