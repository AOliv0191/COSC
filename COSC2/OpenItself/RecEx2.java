public class RecEx2 {
    public static void main(String[] args) {
        String s = "hello";
        int i = 0; 

        countVowel(s, i);
    }

    public static int countVowel(String s, int i){
        if(i == s.length()){
            return 0;
        }
        if(s.charAt(i)=='a' || s.charAt(i)=='e'|| s.charAt(i)=='i'|| s.charAt(i)=='o'|| s.charAt(i)=='u'){
            return 1 + countVowel(s, i+1);
        }
        else{
            return countVowel(s, i+1);
        }

    }
}
