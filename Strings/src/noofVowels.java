public class noofVowels {
    public static void main(String[] args) {
        String s = "sneha is baddie";
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            System.out.println(s.charAt(i));
            char ch = s.charAt(i);
            if (ch=='a'|| ch=='e' ||ch=='i' ||ch=='o' ||ch=='u' || ch == ' ') {
                count++;
            }
        }
        System.out.println(count);
    }
}
