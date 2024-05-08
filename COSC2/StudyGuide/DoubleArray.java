public class StudyGuide1{
    public static void main(String[] args) {
        int[][] array ={{11, 22, 53},
                        {41, 10, 16},
                        {37, 38, 19}};
        print(array);
        System.out.println("------------");
        getAll(array, "row", "Max");
        System.out.println("------------");
        getAll(array, "row", "Min");
        System.out.println("------------");
        getAll(array, "col", "Max");
        System.out.println("------------");
        getAll(array, "col", "Min");
    }

    public static void print(int[][] array){
        for(int i = 0; i < array.length; ++i){
            for(int j = 0; j < array[i].length; ++j){
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static void getAll(int[][] array, String s1, String s2){
        if (s1.equalsIgnoreCase("row")) {
            if(s2.equalsIgnoreCase("Max")){
                for(int i = 0; i < array.length; ++i){
                    System.out.println("Max of " + (i + 1) + "th row: " + getRowMax(array, i));
                }
            }
            else{
                for(int i = 0; i < array.length; ++i){
                    System.out.println("Min of " + (i + 1) + "th row: " + getRowMin(array, i));
                }
            }
        }
        else if(s1.equalsIgnoreCase("col")){
            if(s2.equalsIgnoreCase("Max")){
                for(int i = 0; i < array.length; ++i){
                    System.out.println("Max of " + (i + 1) + "th col: " + getColMax(array, i));
                }
            }
            else{
                for(int i = 0; i < array.length; ++i){
                    System.out.println("Min of " + (i + 1) + "th col: " + getColMin(array, i));
                }
            }
        }
    }

    public static int getRowMax(int[][] array, int row){
        int max = array[row][0];
        for(int i = 0; i < array[row].length; ++i){
            if(max < array[row][i]){
                max = array[row][i];
            }
        }
        return max;
    }

    public static int getRowMin(int[][] array, int row){
        int min = array[row][0];
        for(int i = 0; i < array[row].length; ++i){
            if(min > array[row][i]){
                min = array[row][i];
            }
        }
        return min;
    }
    
    public static int getColMax(int[][] array, int col){
        int max = array[0][col];
        for(int i = 0; i < array.length; ++i){
            if(max < array[i][col]){
                max = array[i][col];
            }
        }
        return max;
    }

    public static int getColMin(int[][] array, int col){
        int min = array[0][col];
        for(int i = 0; i < array.length; ++i){
            if(min > array[i][col]){
                min = array[i][col];
            }
        }
        return min;
    } 
  public static double getAVG(int[][] array){
        int num = (array.length) * (array[0].length);

        int sum = 0;

        for(int i = 0; i < array.length; ++i){
            for(int j = 0; j < array[i].length; ++j){
                sum = sum + array[i][j];
            }
        }

        return (double)sum/num;
    }
}
