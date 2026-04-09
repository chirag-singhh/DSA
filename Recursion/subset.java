import java.util.*;

public class subset {
    public static void main(String[] args) {
        String s = "abc";
        List<String> list = new ArrayList<>();
        sub("",s,0,list);
        System.out.println(list);

    }

    private static void sub(String ans, String s, int idx, List<String> list) {
         if(idx == s.length()) {
           if(ans.length()!=0) list.add(ans);
            return ;
         }
        char ch = s.charAt(idx);
       sub(ans+ch,s,idx+1,list);//pic
       sub(ans,s,idx+1,list);//drop
    }


   
}
