public class secondLargest{

    public static void main(String[] args) {
        int[] nums = {8, 8, 7, 6, 5};
        int largest= Integer.MIN_VALUE;
        int secondLargests = Integer.MIN_VALUE;
        
            for (int  n : nums) {
                if (n>largest) {
                    secondLargests=largest;
                    largest=n;
                }
                else if(n < largest && n > secondLargests) {
                    secondLargests= n;
                }
         
            }
            if (secondLargests == Integer.MIN_VALUE) {
            System.out.println("-1");
        } else {
            System.out.println("Second Largest: " + secondLargests);
        }
        }
    }
