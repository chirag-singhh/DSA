import java.util.Arrays;

public class movezeroend {
    public static void main(String[] args) {
        int[] nums = {0,012,44,73,0,65,0,1,2,0};
        movezeros(nums);
    }

    private static void movezeros(int[] nums) {
        int j = -1;

        // find first zero
        for (int idx = 0; idx < nums.length; idx++) {
            if (nums[idx] == 0) {
                j = idx;
                break;
            }
        }

        if (j == -1) return; // no zero present

        for (int idx = j + 1; idx < nums.length; idx++) {
            if (nums[idx] != 0) {
                swap(nums, idx, j);
                j++;
            }
        }

        System.out.println(Arrays.toString(nums));
    }

    private static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
