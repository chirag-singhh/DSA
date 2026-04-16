import java.util.LinkedList;
import java.util.Queue;

public class countDigit {
    public static void main(String[] args) {
        int[] arr = {34};
        int digit = 2;
        int count = 0;
        Queue<Integer> q = new LinkedList<>();
        for (int i = 0; i < arr.length; i++) {
            q.add(arr[i]);
        }
        // 12 54 32 22
        while (q.size() != 0) {
            int front = q.remove();
            while (front > 0) {
                int z = front % 10;
                if (digit == z) count++;
                front = front / 10;
            }

        }
    }
}
