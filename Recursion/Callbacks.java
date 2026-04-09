
import java.util.Scanner;

public class Callbacks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // printreverse(n);(n);
        printforward(n);
        sc.close();
    }
    public static void printreverse(int n) {
        if(n == 0) return;
        System.out.println(n+" ");
        printreverse(n-1);
    }
    public static void printforward(int n) {
        if(n == 0) return;
       //Callback kaam krega
        printforward(n-1);
         System.out.println(n+" ");
    }
}
