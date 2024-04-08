import java.util.Scanner;

public class StringArrays{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);

        String [] albums = {"Porfiado", "Raro", "Bipolar", "Jueves", "Lamina Once"};
        String album;
        print(albums);

        System.out.print("Which album you are searching? ");
        album = input.nextLine();
        boolean have= find(albums, album);
        if(have){
            System.out.println("We do have " + album);
        }
        else{
            System.out.println("Sorry, we don't have " + album);
        }
        System.out.println();

        System.out.println("Write the name of a song from Cuarteto De Nos: ");
        String songName = input.nextLine();
        char [] song = convertToArray(songName);
        for(int i = 0; i < (song.length); i++){
            System.out.print(song[i] + " ");
        }
        System.out.println();

        String cancion = convertToString(song);

        System.out.println(cancion);
    }

    public static void print(String[] a){ //Print the array.
        for(int i = 0; i < (a.length - 1); i++){
            System.out.print(a[i] + ", ");
        }
        System.out.println(a[a.length-1] + "\n");
    }

    public static boolean find(String[] a, String target){//true or false
        for(int i = 0; i < a.length; i++){
            if(a[i].equals(target)){
                return true;
            }
        }
        return false;
    }

    public static char[] convertToArray(String a){ //convert String to array
        int index = a.length();

        char[] name = new char[index];

        for(int i = 0; i < index; i++){
            name[i] = a.charAt(i);
        }
        return name;
    }

    public static String convertToString(char[] song){//array of char to String
        String name = "";

        for(int i = 0; i < song.length; i++){
            name += song[i];
        }
        return name;
    }
}
