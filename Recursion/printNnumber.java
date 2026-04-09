public class printNnumber{
   public static void main(String[] args) {
    int n = 10;
    print(1,n);

   }
   public static void print(int x ,int n) {
    if (x> n) {
        return;
    }
    System.out.println(x);
    print(x+1,n);
    
   }
}