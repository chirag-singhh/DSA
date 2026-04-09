public class missingnub {
    public static void main(String[] args) {
        int[] nums = {3,0,1};
        
        solution(nums);
    }
    public static void solution(int[] nums){
        int n = nums.length;
        int sumN = n*(n+1)/2;
        int cursum= 0;
        for (int i = 0; i < nums.length; i++) {
            cursum += nums[i];
        }
        int ans = sumN-cursum;
        System.out.println(ans);
    }
}
