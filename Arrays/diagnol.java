public class diagnol {
    public static void main(String[] args) {
        int[][] arr = {
            {1,2,5},
            {4,5,6},
            {7,8,9}};
            int sum1 = 0;
            int sum2 = 0;
            int n = arr.length;
            for (int i = 0; i < arr.length; i++) {
                 for(int j = 0 ; j < arr[i].length;j++ ){
                    if (i == j) {
                        sum1+=arr[i][j];
                        sum2+=arr[i][n-i-1];
                    }
                }
            }
             System.out.println("Diagonal Sum = " + sum1);
             System.out.println("Diagonal Sum = " + sum2);
    }
}
