public class leetcode1752 {
    
    public static void main(String[] args) {
        int[] nums = {5, 3, 4, 1, 2}  ;
        int pivot=-1 ;

          for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] > nums[i + 1]) {
                pivot = i;
                break;
            }
        }
        boolean sorted = true;
        for (int i = pivot + 1; i < nums.length - 1; i++) {
            if (nums[i] > nums[i + 1]) {
                sorted = false;
                break;
            }
        }
        for (int i = 0; i < pivot-1; i++) {
            if (nums[i] > nums[i + 1]) {
                sorted = false;
                break;
            }
        }
            if (pivot != -1 && nums[nums.length - 1] > nums[0]) {
            sorted = false;
        }
        System.out.println(sorted);
       
        }
    }
    

