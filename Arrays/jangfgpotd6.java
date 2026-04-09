import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class jangfgpotd6 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 1, 3, 4, 2, 3};
        int k = 4;

        List<Integer> result = new ArrayList<>();
        Map<Integer, Integer> freq = new HashMap<>();

        int distinctCount = 0;

        // 1️⃣ First window
        for (int i = 0; i < k; i++) {
            freq.put(arr[i], freq.getOrDefault(arr[i], 0) + 1);
            if (freq.get(arr[i]) == 1) {
                distinctCount++;
            }
        }
        result.add(distinctCount);

        // 2️⃣ Slide the window
        for (int i = k; i < arr.length; i++) {

            // element going out
            int out = arr[i - k];
            freq.put(out, freq.get(out) - 1);
            if (freq.get(out) == 0) {
                distinctCount--;
            }

            // element coming in
            int in = arr[i];
            freq.put(in, freq.getOrDefault(in, 0) + 1);
            if (freq.get(in) == 1) {
                distinctCount++;
            }

            result.add(distinctCount);
        }

        System.out.println(result);
    }
}
