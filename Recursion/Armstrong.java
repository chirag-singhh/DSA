public class Armstrong {
    public static void main(String[] args) {
        int n = 1635;
        int t = 0 ;
        int original = n;
        while(n!=0){
            t++;
            n = n/10;
        }
        
        // System.out.println(t); 
        n = original;
        int sum = 0;
        for(int i = 0 ; i < t ; i++){
            int x = n%10;
            sum += Math.pow(x, t);
            n = n/10;
            
        }
        System.out.println(sum);
        if (sum == original) {
            System.out.println("Armstrong");
        }
        else{
            System.out.println("non Armstrong");
        }
    }
}
