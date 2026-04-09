import  java.util.ArrayList;

public class maxKSizedSubarray {
   public static void main(String[] args) {
    int[] arr = {1, 2, 3, 1, 4, 5, 2, 3, 6};
    int k = 3;
    // int max = Integer.MIN_VALUE;
      ArrayList<Integer> list = new ArrayList<>();

        // start of window
        for (int i = 0; i <= arr.length - k; i++) {

            int max = arr[i];   

            // check current window
            for (int j = i; j < i + k; j++) {
                if (arr[j] > max) {
                    max = arr[j];
                }
            }

            list.add(max);
        }

    System.out.println(list);
   }
}
