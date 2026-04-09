package Stacks;

import java.util.Stack;

public class pushAtBottom {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();

        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);
        System.out.println(st);
        int ele = 60;

        PushAtBottom(st,ele);
        System.out.println(st);

    }
  // recursion
    private static void PushAtBottom(Stack<Integer> st, int ele) {
        if (st.size()==0){
            st.push(ele);
            return;
        }
            int top = st.pop();
        PushAtBottom(st,ele);
        st.push(top);
    }
}
