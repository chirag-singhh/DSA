public class vovels {
    public static void main(String[] args) {
        String st = "aeiou";
        st = st.toLowerCase();
        int vovelscount = 0;
        int i = 0; int j = st.length();
        while (i<j) {
            char ch = st.charAt(i);
             if ( ch == 'a' ||  ch == 'e' ||   ch == 'i' ||   ch == 'o' ||   ch == 'u') {
            vovelscount++;
            
        }i++;
        
        }
        System.out.println(vovelscount);
       
    }
}
