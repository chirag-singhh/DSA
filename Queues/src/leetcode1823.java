import java.util.LinkedList;
import java.util.Queue;

public class leetcode1823 {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(10); //0c
        q.add(20); //1
        q.add(30); //2c
        q.add(40); //3 c

        q.add(50); //4c

        q.add(60); //4c
        q.add(70); //4c




        int n = q.size();
        int k = 7;

        while(q.size()!=1){
            for(int i = 0 ; i <k-1 ;i++){
                q.add(q.remove());
            }
            q.remove();
        }

        System.out.println(q);
    }
}
