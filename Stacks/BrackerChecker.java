package Stacks;

import java.util.Stack;

public class BrackerChecker {


    }

    public boolean isBalanced(String s) {

        Stack<Character> st = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            // opening brackets
            if (ch == '{' || ch == '(' || ch == '[') {
                st.push(ch);
            } else {
                // closing brackets
                if (st.isEmpty()) return false;

                char top = st.peek();
                if (sameStyle(top, ch)) {
                    st.pop();
                } else {
                    return false;
                }
            }
        }

        // stack should be empty at the end
        return st.isEmpty();
    }

    static boolean sameStyle(char a, char b) {
        if (a == '(' && b == ')') return true;
        if (a == '{' && b == '}') return true;
        if (a == '[' && b == ']') return true;
        return false;
    }
}
