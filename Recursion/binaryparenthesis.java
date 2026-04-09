import java.util.*;

class binaryparenthesis {

    public void generate(int n, String s, List<String> ans) {
        if (s.length() == n) {
            ans.add(s);
            return;
        }
            generate(n,s + "0", ans);
             if (s.length() == 0 || s.charAt(s.length() - 1) != '1') {
            generate(n, s + "1", ans);
        }
    }

    public List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<>();
        generate(2, "", ans);   // 🔥 call missing thi
        return ans;
    }

    // 🔑 MAIN METHOD (VS Code run ke liye)
    public static void main(String[] args) {
        binaryparenthesis obj = new binaryparenthesis();
        List<String> result = obj.generateParenthesis(3);
        System.out.println(result);
    }
}
