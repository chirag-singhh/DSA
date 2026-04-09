import java.util.ArrayList;
import java.util.List;

public class arrsubset2 {
     public static void main(String[] args) {
        int[] s = {1,2,3};
        List<String> List = new ArrayList<>();
        solution("",s,0,List);
        System.out.println(List);
    }

     private static void solution(String ans, int[] s, int idx, List<String> list) {
            if (idx == s.length) {
            if (!ans.isEmpty())   
                list.add(ans);
            return;
        }
         solution(ans + s[idx], s, idx + 1, list);
        solution(ans, s, idx + 1, list);
     }

    
}
