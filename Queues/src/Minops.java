public class Minops {
    public static boolean isPrime(int num) {

        if(num <= 1)
            return false;

        for(int i = 2; i <= num/2; i++) {
            if(num % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        int ops = 0;

        // prime  2 , 3 , 5 , 7
        // non prime 4 ,6 , 8 , 9 ,10
        // even prime odd not prime
        for(int i = 0 ; i < arr.length;i++){
            // even index

            if(i % 2 == 0 ){

                while(!isPrime(arr[i])){
                    arr[i]++;
                    ops++;
                }
            }

            // odd index
            else{

                while(isPrime(arr[i])){
                    arr[i]++;
                    ops++;
                }
            }
        }
        System.out.println(ops);
    }
}
