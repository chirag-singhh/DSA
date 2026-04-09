import java.util.*;

class reverseK {
    public Queue<Integer> reverseFirstK(Queue<Integer> q, int k) {

        // Edge cases
        if (k <= 0 || k > q.size()) {
            return q;
        }

        Stack<Integer> st = new Stack<>();

        // Step 1: Push first k elements into stack
        for (int i = 0; i < k; i++) {
            st.push(q.remove());
        }

        // Step 2: Add stack elements back
        while (!st.isEmpty()) {
            q.add(st.pop());
        }

        // Step 3: Move remaining elements to back
        int remaining = q.size() - k;

        for (int i = 0; i < remaining; i++) {
            q.add(q.remove());
        }

        return q;
    }
}