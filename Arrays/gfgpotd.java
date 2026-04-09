import java.util.*;
public class gfgpotd {
    public static void main(String[] args) {
        int[] arr = {9479 ,488 ,2374 ,1583 ,5863, 7811, 6916, 1685, 3960} ;
        Arrays.sort(arr);
         int sum = 0;
        int i=1;
        int k =5;
        while(k!=0){
            
            int x = arr.length-i;
            sum = sum+arr[x];
            i++;
        k--;
        }
        
       System.out.println(sum);
    }
}
