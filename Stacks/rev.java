import java.util.Arrays;

public class rev {
    public static void main(String[] args) {
        int[] arr = {4, 5, 2, 10, 8};
        // [8,10,2,5,4]
         int a = 0;
         int b = arr.length-1;
         while(a < b){
            arr[a] = arr[a]+arr[b];
            arr[b] = arr[a]-arr[b];
            arr[a] = arr[a]-arr[b];
            
            a++;
            b--;
         }
       
        System.out.println(Arrays.toString(arr));
    }
}