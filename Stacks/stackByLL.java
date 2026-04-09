package Stacks;
class Node{
    int val;
    Node next;
    Node(int val){
        this.val = val;
    }
}

class MyStack{
    Node head;
    int len=0;

    int peek()throws Exception{
        if(head == null){
            throw  new Exception("Stack UnderFlow");
        }
        return head.val;
    }

    int pop() throws Exception{
        if(head == null){
            throw  new Exception("Stack UnderFlow");
        }
        int x = head.val;
        head = head.next;
        len--;
        return  x;
    }
    void push(int val){
        Node t = new Node(val);
        if(len == 0){
            head = t;
        }
        else {
            t.next = head;
            head = t;
        }
        len++;
    }
    int size(){
        return len;
    }
    void display(){
        Node t = head;
        while (t!=null){
            System.out.println(t.val+" ");
            t=t.next;
        }
        System.out.println();
    }
}
public class stackByLL {
    public static void main(String[] args) throws Exception {
        MyStack st = new MyStack();

        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);
        st.pop(); st.pop(); st.pop(); st.pop(); st.pop();
        st.display();
        System.out.println(st.peek());
        System.out.println();
        int top = st.pop();
        st.display();
        System.out.println(top);
    }
}
