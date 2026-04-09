import java.util.*;

public class arrsub {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
       List<List<Integer>> list = new ArrayList<>();
        sub(new ArrayList<>(),arr,0,list);
        System.out.println(list);

    }

    private static void sub(List<Integer> ans, int[] s, int idx,  List<List<Integer>> list) {
           for (int i = idx; i < s.length; i++) {
            ans.add(s[i]);                 // pick
            list.add(new ArrayList<>(ans));  // add immediately (lexicographic)
            sub(ans, s, i + 1, list);      // recurse
            ans.remove(ans.size() - 1);      // backtrack
        }

    }
   
}
