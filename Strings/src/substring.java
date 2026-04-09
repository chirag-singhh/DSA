public class substring {
    public static void main(String[] args) {

        // // System.out.println(s);
        // // s="sneha";
        // // System.out.println(s);
        // System.out.println(s.substring(8));
        // System.out.println(s.substring(0,5)); // 0 se 4 print

        // String s = "sneha";//substring swass baddie hai
        // for (int i = 0; i < s.length(); i++) {
        // for (int j = i + 1; j <= s.length(); j++) {
        // System.out.print(s.substring(i, j)+" ");
        // }System.out.println();
        // }System.out.println();

        String s = "aaa";
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j <= s.length(); j++) {
                System.out.print(s.substring(i, j) + " ");
                // sum = sum + Integer.parseInt(s.substring(i,j));
            }
            System.out.println();
        }
        // System.out.println(sum);

    }
}
