public class GCD {
    public static void main(String[] args) {
        System.out.println(ans(50, 125));
    }
    public static int ans(int a , int b) {
        if(a==0) return b;
        return ans(b%a,a);

    }
}
