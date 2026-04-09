
import java.util.ArrayList;
import java.util.List;


public  class subset2{
    public static void main(String[] args) {
        String s = "abc";
        List<String> List = new ArrayList<>();
        solution("",s,0,List);
        System.out.println(List);
    }

    private static void solution(String ans,String s , int idx,List<String> List) {
            if (idx == s.length()) {
                if (ans.length() !=0) List.add(s);
                return;
              
            }
            char ch = s.charAt(idx);
            solution(ans+ch,s, idx+1, List);
            solution(ans,s, idx+1, List);
    }
    }
