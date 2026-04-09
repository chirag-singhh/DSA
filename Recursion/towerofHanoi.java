public class towerofHanoi {
    public static void main(String[] args) {
        hanoi(5,"A","B","C");
    }

    private static void hanoi(int n, String A, String B, String C) {
     if(n==0)return;
    // n-1 disk usko A -> B via C
       hanoi(n-1,A,C,B);
    // target sbse bada disk usko A -> C
    System.out.println(A+"->"+C);
    //n-1 disk B se C via A
     hanoi(n-1,B,A,C);
    }

   //  return (int)Math.pow(2,n)-1;
}
 