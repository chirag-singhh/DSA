import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class reverse {
    public static void main(String[] args) {

        Stack<Integer> st = new Stack<>();
        Queue<Integer> q = new LinkedList<>();
        q.add(10); //0
        q.add(20); //1
        q.add(30); //2
        q.add(40); //3
        q.add(50); //4
        q.add(60); //5
        while(q.size()!=0){
            st.push(q.remove());
        }
        while(st.size() != 0){
            q.add(st.pop());
        }
        System.out.println(q);
    }

}
