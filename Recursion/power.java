// public class power {
//     public static void main(String[] args) {
//         int soln =pow(2,-2);
//         System.out.println(soln);
//     }
//     public static int pow(int a , int b) {
//         if(b == 0) return 1;
//         // int ans = a * pow(a, b-1);
//         int call = pow(a,b/2);
//         if(b%2==0) return call*call;
//         else return a*call*call;
//     }
// }


public class power {
    public static void main(String[] args) {
        double soln =pow(1,-2147483648);
        System.out.println(soln);
    }
    public static double  pow(double  a , int  b) {
        if(b == 0) return 1;
         if(b < 0) return 1/pow(a,-b);
        // int ans = a * pow(a, b-1);
        double  call = pow(a,b/2);
        if(b%2==0) return call*call;
        else return a*call*call;
    }
}
