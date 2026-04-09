public class perfectno {
    public static void main(String[] args) {
        int n = 6;
        int sum = 1;
        for (int i = 2 ; i <= n/2; i++){
            if (n % i == 0) {
                // System.out.println(i);
                sum+=i;
            }
        }
        if(sum == n){
            System.out.println("Number is perfect");
        }
        else{
            System.out.println("Number is not perfect");
        }
    }
}
