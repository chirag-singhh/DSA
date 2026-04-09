import java.util.LinkedList;
import java.util.Queue;

public class traverse {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        q.add(50);
        q.add(60);


        int n = q.size();
        for(int i = 0; i<n;i++){
            int a = q.remove();
            System.out.println(a);
            q.add(a);
        }
        System.out.println(q);
    }
}
