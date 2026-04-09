import java.util.LinkedList;
import java.util.Queue;

public class BasicTraversal {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(10); //0
        q.add(20); //1
        q.add(30); //2
        q.add(40); //3
        q.add(50); //4
        q.add(60); //5

        int n = q.size();

        // Insert at any position 4->100
        int x = 4; int y = 100;
        for(int i = 0 ; i< x; i++ ){
            q.add(q.remove());
        }
        q.add(y);

        for(int i = 0 ; i < n-x ;i++ ){
            q.add(q.remove());
        }

        // Remove a specific positon
        for(int i = 0 ; i< x; i++ ){
            q.add(q.remove());
        }
        q.remove();

        for(int i = 0 ; i < n-x ;i++ ){
            q.add(q.remove());
        }


        // Specific positon pe peek
        for(int i = 0 ; i< x; i++ ){
            q.add(q.remove());
        }
        System.out.println( q.peek());

        System.out.println(q);
    }
}
