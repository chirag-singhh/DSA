import java.util.Arrays;

public class lc961 {
public static void main(String[] args) {
    int[] arr = {3,1,-2,-5,0,-4};
    int[] ans = new int[arr.length];
    int pos = 0;
    int neg = 1;
    for (int i = 0; i < arr.length; i++) {
        if (arr[i]>=0) {
            ans[pos]=arr[i];
            pos = pos+2;
        }
        else{
            ans[neg]=arr[i];
            neg = neg+2;
        }
    }
    System.out.println(Arrays.toString(ans));

    

}    
}
