public class potd5jan {
    public static void main(String[] args) {
        int[][] matrix = {{1,2,3},{-1,-2,-3},{1,2,3}};
          
            int count = 0;
            long sum = 0;
            int negsmall = Integer.MAX_VALUE;
        for (int i = 0; i < matrix.length; i++) {
            for(int j = 0 ; j < matrix[i].length;j++){
                int val = matrix[i][j];
                if(val< 0){
                    count++;
                }
                int absVal = Math.abs(val);
                sum+=absVal;
                negsmall = Math.min(negsmall, absVal);
            }System.out.println();
    }

            System.out.println(sum);
            System.out.println(count);
            if(count%2==0){
                System.out.println(sum);
            }else{
                sum=sum-2L*negsmall;
                System.out.println(sum);
            }
}


}
