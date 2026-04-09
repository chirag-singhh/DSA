

public class lc1423 {
    public static void main(String[] args) {
         int[] arr = {1,2,3,4,5,6,1};
        int k = 3;
        int lsum = 0;int rsum = 0;
        int maxsum = 0;

        for (int i = 0; i < k; i++) {
            lsum += arr[i];
        }maxsum=lsum;
        
        int rindx = arr.length-1;
        for (int i = k-1; i >=0; i--) {
            lsum = lsum-arr[i];
            rsum = rsum+arr[rindx];

            rindx--;
        }maxsum = Math.max(maxsum, lsum+rsum);

        System.out.println(maxsum);
    }
}
 
