
import java.util.Arrays;

public class replaace {
    public static void main(String[] args) {
        int[] arr = {2,4,5,9,0};
        for (int i = 0; i < arr.length; i++) {
            int ele = arr[i];
            if (i%2 == 0) {
                
                arr[i] = ele * ele;    
            }
            else{
                arr[i] = (int)Math.pow(ele, 3)-3;
            }
        }
    System.out.println(Arrays.toString(arr));
    }
    
}
