import java.util.*;
public class lc169 {
    public static void main(String[] args) {

        int[] arr = {3,3,3,1,1,1,3,3};
        int n = arr.length;
        int maxfreq = 0;
        int element = arr[0];

        Map<Integer,Integer> freq = new HashMap<>();
        
        for(int i = 0 ; i< arr.length;i++){
            freq.put(arr[i], freq.getOrDefault(arr[i],0)+1);
        }
         n = n/2;
        for(int key : freq.keySet()){
            if(freq.get(key) > n){
                // maxfreq = freq.get(key);
                element = key;
                
            }
        }
       
            System.out.println(element);
    }
}
