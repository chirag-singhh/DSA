
public class  leet136{
    public static void main(String[] args) {
        int []  nums = {2,2,1};
        leet136 obj = new leet136();
        System.out.println(obj.singleNumber(nums));
        
    }
      public int singleNumber(int[] nums) {
        // Arrays.sort(nums);
        // if(nums.length == 1) return nums[0];
        // if (nums[0] != nums[1]) return nums[0];
        // for(int i = 1; i< nums.length-1;i++){
        //     if(nums[i]!=nums[i-1] && nums[i]!= nums[i+1]) {
        //      return nums[i];
        //     }
           
        // }  return nums[nums.length - 1];

        int ans = 0;
        if(nums.length == 1) return nums[0];
        for(int i =  0;i< nums.length;i++){
            ans^=nums[i];
        }
        return ans;
    }

    

}