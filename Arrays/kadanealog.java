public class kadanealog {
    public static void main(String[] args) {
        int[]arr ={-2,1,-3,4,-1,2,1,-5,4};
        int maxsum = Integer.MIN_VALUE;
        int cursum = 0;
        for (int i = 0; i < arr.length; i++) {
            cursum = cursum+arr[i];
            if(cursum>maxsum){
                maxsum=cursum;
            }
            if (cursum<0) {
             cursum=0;
            }
        }
        System.out.println(maxsum);
    }
}
