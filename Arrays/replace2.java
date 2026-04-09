
import java.util.Arrays;

public class replace2 {
    public static void main(String[] args) {
        int[] arr = {2,4,5,9,0};
        for (int i = 0; i < arr.length; i++) {
            int ele = arr[i];
            if (i%2 == 0) {
                
                arr[i] = arr[i];    
            }
            else{
                arr[i] = (int)Math.pow(ele, 2);
            }
        }
    System.out.println(Arrays.toString(arr));
    }
    
}
