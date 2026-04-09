package Stacks;

import java.util.Stack;

public class BasciStacks {
    public static void main(String[] args) {

        Stack<String> st = new Stack<>();
        st.push("Chirag");
        st.push("Sneha");
        st.push("Muggu");
        st.push("Veer");
        st.push("Daddy");
        System.out.println(st);
        System.out.println(st.peek());
        st.pop();
        System.out.println(st);
        st.pop();
        st.pop();
        st.pop();
        System.out.println(st);
        System.out.println(st.size());
        String s = st.pop();
        System.out.println(st);
        System.out.println(s);

    }
}
