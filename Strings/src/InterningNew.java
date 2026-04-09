import java.util.Arrays;

public class InterningNew {
    public static void main(String[] args) {
        String s1 = "chirag";
        String s2 = "ragchi";
        char[] ch = s1.toCharArray();
        s1 = ch.toString();
        System.out.println(s1);

       
        // System.out.println( areAnagrams(s1,s2));
    }

    public static boolean areAnagrams(String s1, String s2) {
        // code here
        if(s1.length()!=s2.length()) return false; 
        char[] sone = s1.toCharArray();
        Arrays.sort(sone);
        char[] stwo = s2.toCharArray();
        Arrays.sort(stwo);   
        s1 = sone.toString();
       
        s2 = stwo.toString();
        
        return s1.equals(s2);
        
    }
}
