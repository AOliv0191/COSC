public class Concatenator{
    public static void addAccent(String str){
        String [] words = str.split(" ");
        for (int i = 0; i<words.length; i++){
            System.out.print(words[i]+ "pft");
        }
    }
}