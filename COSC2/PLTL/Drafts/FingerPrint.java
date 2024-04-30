import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class FingerPrint {
    //Fields
    private String[][] data;
    private String name;
    private int year;
    private int rows;
    private int cols;

    //Constructors
    public FingerPrint(String fileName)throws IOException{
        Scanner file = new Scanner(new File(fileName));
        this.name = file.nextLine();
        this.year = file.nextInt();
        this.rows = file.nextInt();
        this.cols = file.nextInt();
        file.nextLine();
        this.data = new String[rows][cols];
        
        for(int i = 0; i < rows; ++i){
            String line = file.nextLine();
            String[] token = line.split("");

            for(int j = 0; j < cols; ++j){
                data[i][j] = token[j];
            }
        }
        
    }
    public FingerPrint(String[][] data, String name, int year, int rows, int cols){
        this.data = data;
        this.name = name;
        this.year = year;
        this.rows = rows;
        this.cols = cols;
    }
    //Methods
    /**equals()
     * This method takes a FingerPrint Object, and will compare the
     * content of the data.
     * @param finPr a FingerPrint Object.
     * @return a boolean expression that indicates if both FingerPrint
     * objects are identical or not.
     */
    public boolean equals(FingerPrint finPr){
        if((this.rows != finPr.rows )|| (this.cols != finPr.cols)){
            return false;
        }
        for(int i = 0; i < rows; ++i){
            for(int j = 0; j < cols; ++j){
                if(!this.data[i][j].equals(finPr.data[i][j])){
                    return false;
                }
            }
        }
        return true;
    }
    /**getNumbersOfPixels()
     * This method return a number representing the number of pixels
     * of this fingerprint, i.e., number of rows x cols.
     * @return an int representing the number of pixels.
     */
    public int getNumberOfPixels(){
        return rows * cols;
    }

    /**toString()
     * This method provides a String representation of this FingerPrint:
     * Fingerprint for: <name>. Year registered: <year>. Number of Pixels:
     * <pixels>
     */
    public String toString(){
        return "Fingerprint for: " + name + "\n" + 
        "Year registered: " + year + "\n" +
        "Number of Pixels: " + getNumberOfPixels();
    }

    /** getImage()
     * This method will print the 2D array containing the data of the figure
     * loaded from the file.
     */
    public void getImage(){
        for(int row = 0; row < data.length; ++row){
            for(int col = 0; col < data[row].length; ++col){
                System.out.print(data[row][col]);
            }
            System.out.println();
        }
    }

    //getters
    public String[][] getData(){
        return this.data;
    }
    public String getName(){
        return this.name;
    }
    public int getYear(){
        return this.year;
    }
    public int getRows(){
        return this.rows;
    }
    public int getCols(){
        return this.cols;
    }

    //setters
    public void setData(String[][] data){
        this.data = data;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setYears(int year){
        this.year = year;
    }
    public void setRows(int rows){
        this.rows = rows;
    }
    public void setCols(int cols){
        this.cols = cols;
    }
}
