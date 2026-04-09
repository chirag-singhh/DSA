public class lc1390 {
    public static void main(String[] args) {
        int[] arr = {21,21};
        int ans = 0;

        for (int i = 0; i < arr.length; i++) {

            int count = 0;   
            int sum = 0;

            for (int j = 1; j <= arr[i]; j++) {
                if (arr[i] % j == 0) {
                    count++;
                    sum += j;
                }
            }

            if (count == 4) {
                ans += sum;
            }
        }

        System.out.println(ans);
    }
}
