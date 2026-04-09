// //Approach 1
class Node {
    int val;
    int minval;
    public Node(int val,int minval){
        this.val = val;
        this.minval = minval;
    }
}
class MinStack {
    Stack<Node> st;
public MinStack() {
      st = new Stack<>();
    }

    void push(int val) {
        if(st.isEmpty()){
            st.push(new Node(val,val));
            return;
        }
        else{
            Node top = st.peek();
            int mintop = top.minval;
            if(val < mintop){
                 st.push(new Node(val,val));
            }else st.push(new Node(val,mintop));
        }
    }

    void pop() {
        if(st.isEmpty()) return;
        st.pop();
    }

    int top() {
        if(st.isEmpty()) return -1;
        Node topelement = st.peek();
        return topelement.val;

    }

    int getMin() {
        if(st.isEmpty()) return -1;
        Node topelement = st.peek();
        return topelement.minval;
    }
};

//Approach 2- two stacks

class MinStack {
    Stack<Integer> st;
    Stack<Integer> minst;

    public MinStack() {
        st = new Stack<>();
        minst = new Stack<>();
    }

    void push(int val) {
        if (st.isEmpty()) {
            st.push(val);
            minst.push(val);
            return;
        }
        st.push(val);
        if (val <= minst.peek())
            minst.push(val);
        return;
    }

    public void pop() { // T: O(1), S: O(1)
        if (st.isEmpty()) {
            return;
        }
        int val = st.pop();
        if (val == minst.peek()) {
            minst.pop();
        }
    }

    int top() {
        if (st.isEmpty())
            return -1;
        return st.peek();

    }

    int getMin() {
        if (st.isEmpty())
            return -1;
        return minst.peek();
    }
};