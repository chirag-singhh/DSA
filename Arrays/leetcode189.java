public  class leetcode189{
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7};
        
        int k = 3;
         k = k % nums.length;
        // rotate(nums,k);  // tle kha jayega
        reverse(nums,0,nums.length-1); // full array reverse
        reverse(nums,0,k-1);
        reverse(nums,k,nums.length-1);
        
        }

    private static void reverse(int[] nums, int start, int end) {
       while(start < end){
        int temp = nums[start];
       nums[start] = nums[end];
       nums[end]= temp;
       start++;
       end--;
       }
       
    }

    private static void rotate(int[] nums, int k) {
        k = k % nums.length;
        int ix = 0;
        while(ix < k){
        int last = nums[nums.length-1];
        for(int i = nums.length-1;i>0;i--){
            nums[i]= nums[i-1];

        }
        nums[0]=last;
        ix++;
        
    }
    
}
  
    

}