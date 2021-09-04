//Java Basics 2 - Assignment 2
public class max2D {
    public static void main(String [] args){
        int [][] matrix = { 
            {2, 21, 0, 89, 11},
            {14, 39, 1, 72, 44},
            {31, 45, 58, 999, 100}
         };
        int r = -1;
        int c = -1;
        int max = 0;
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[0].length ; j++ ){
                if(max < matrix[i][j]){
                    max = matrix[i][j];
                    r = i;
                    c = j;
                }
            }
        }
        System.out.println("The max value in this 2D array is: " + max);
        System.out.println("found on row: " + r + ", column: " + c + " (zero-indexed)");

    }
}
