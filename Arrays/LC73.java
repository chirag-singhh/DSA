import java.util.Arrays;

public class LC73 {
    public static void main(String[] args) {
        int[][] matrix = {{1,1,1},{1,0,1},{1,1,1}};
        int rows = matrix.length;
        int cols = matrix[0].length;
        System.out.println(cols);
        boolean[] rowZero = new boolean[rows];
        boolean[] colZero = new boolean[cols];


        for(int i = 0 ; i< rows;i++){
            for(int j = 0;j< cols;j++){
                if (matrix[i][j]==0) {
                    rowZero[i]=true;
                    colZero[j]=true;
                }
            }
        }
            for(int i = 0 ; i < rows ; i++){
                if (rowZero[i]) {
                    for(int j = 0 ; j < cols;j++){
                        matrix[i][j] = 0;
                }
                }
            }

            for(int j = 0 ; j < cols ; j++){
                if (colZero[j]) {
                    for(int i = 0 ; i < cols;i++){
                        matrix[i][j] = 0;
                }
                }
            }
            for (int[] row : matrix) {
            System.out.println(Arrays.toString(row));
        }
        }
    }
    

