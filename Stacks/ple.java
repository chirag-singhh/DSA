import java.util.Arrays;
import java.util.Stack;

public class ple {
    public static void main(String[] args) {
        int[] arr = {4, 5, 2, 10, 8};
        // [-1,4,-1,2,2]
        int[] nge = new int[arr.length];
        Stack<Integer> st = new Stack<>();

        for(int i = 0 ;i<arr.length;i++){

            while (!st.isEmpty() && st.peek() > arr[i]) { 
                st.pop();
            }

            if (st.isEmpty()) {
                nge[i] = -1;
            } else {
                nge[i] = st.peek();
            }

            st.push(arr[i]);
        }

        System.out.println(Arrays.toString(nge));
    }
}