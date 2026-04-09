import java.util.ArrayList;
import java.util.List;

public class arrsubsetlexo {
     public static void main(String[] args) {
        int[] s = {1,2,3};
        List<List<Integer>> List = new ArrayList<>();
         List.add(new ArrayList<>());
        solution(new ArrayList<>(),s,0,List);
        System.out.println(List);
    }

     private static void solution(List<Integer> ans, int[] s, int idx, List<List<Integer>> list) {
            for(int i = idx;i< s.length;i++){
                ans.add(s[i]);
                list.add(new ArrayList<>(ans));  
                solution(ans, s, i+1, list);
             ans.remove(ans.size() - 1);   
            }
     }

    
}
