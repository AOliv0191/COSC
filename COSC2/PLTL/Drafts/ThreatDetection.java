import java.io.IOException;
import java.util.Scanner;

public class ThreatDetection {
    public static void main(String[] args)throws IOException{
        Scanner finger = new Scanner(System.in);
        FingerPrint original = FileProcessor.loadFingerprint("Original.txt");;
        
        System.out.println("May you please provide your fingerprint: ");
        String fileName = finger.nextLine();
        FingerPrint userFinger= FileProcessor.loadFingerprint(fileName);;
        int tries = 0;
        int maxTries = 5;
        
        while(tries < maxTries){
            try{
                boolean check = accuracyOfFingerPrint(original, userFinger);
                
                if(check){
                    System.out.println("Succed Authentication");
                tries = maxTries + 1; 
                }   
                else{
                    System.out.println("Access Denied. Please provide another fingerprint (You still have " + (maxTries - tries)+" tries)");
                    fileName = finger.nextLine();
                    userFinger = FileProcessor.loadFingerprint(fileName);
                    ++tries;
                  }
            }
            catch(IOException e1){
                System.out.println("Hm... I think that archive doesn't exists.");
                System.out.println("Please provide other name:");
                fileName = finger.nextLine();
                userFinger = FileProcessor.loadFingerprint(fileName);
                
            }
        }
          
    }
    public static boolean accuracyOfFingerPrint(FingerPrint original, FingerPrint userFinger){
        double epsilon = 10.0;
        int matched = 0;
        String[][] originalPrint = original.getData();
        String[][] userPrint = userFinger.getData();
        int originalNumberItems = original.getNumberOfPixels();
        int userNumberItems = userFinger.getNumberOfPixels();
        int numberOfItems;

        if(originalNumberItems < userNumberItems){
            numberOfItems = originalNumberItems;
            for(int row = 0; row < originalPrint.length; ++row){
                for(int col = 0; col < originalPrint[row].length; ++col){
                    if(originalPrint[row][col].equals(userPrint[row][col])){
                        ++matched;
                    }
                }
            }
        }
        else{
            numberOfItems = userNumberItems;
            for(int row = 0; row < userPrint.length; ++row){
                for(int col = 0; col < userPrint[row].length; ++col){
                    if(userPrint[row][col].equals(originalPrint [row][col] )){
                        ++matched;
                    }
                }
            }
        }
        
        double accuracy = ((double)matched/numberOfItems) * 100;
        System.out.println(accuracy);
        double imprecision = 100 - accuracy;
        boolean pass = imprecision <= epsilon;
        
        return pass;
    }
        
}

