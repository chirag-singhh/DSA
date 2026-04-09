// public class fibo {
//     public static void main(String[] args) {
        
//         System.out.println(fibo(9));
//     }

//     private static int fibo(int n) {
//        if(n== 0 || n ==1) return n;
//        return fibo(n-1)+fibo(n-2);
//     }
// }

public class fibo {
    public static void main(String[] args) {
        int n = 15;

        int a = 5, b = 6;

        System.out.print(a + " " + b + " ");

        for(int i = 2; i < n; i++) {
            int c = a + b;
            System.out.print(c + " ");
            a = b;
            b = c;
        }
    }
}