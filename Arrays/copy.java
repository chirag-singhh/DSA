import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class copy {
    public static void main(String[] args) {
         int[] arr = {1, 2, 1, 3, 4, 2, 3};
        int k = 4;

        ArrayList<Integer> lists = new ArrayList<>();
        Map<Integer,Integer> freq = new HashMap<>();

         int distinctCount = 0;

         for(int i = 0; i<k;i++){
            freq.put(arr[i],freq.getOrDefault(arr[i],0)+1);
             if (freq.get(arr[i]) == 1) {
                distinctCount++;
            }
         }
         lists.add(distinctCount);

         for(int i = k ; i<arr.length;i++){
            int out = arr[i-k];
            freq.put(out, freq.get(out)-1);
             if (freq.get(out) == 0) {
                distinctCount--;
            }

            int in = arr[i];
             freq.put(in, freq.getOrDefault(in, 0) + 1);
            if (freq.get(in) == 1) {
                distinctCount++;
            }

            lists.add(distinctCount);
         }


System.out.println(lists);
         
    }
}
