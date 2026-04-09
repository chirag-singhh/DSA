import  java.util.*;
public class arrayrecusion {
    public static void main(String[] args) {
        int [] arr = {0,1,0,3,12};
     
        // recprint( arr,0);
       revrecprint( arr,0);
        
        System.out.println(linear(arr, 1, 0));
    }
    public static void recprint(int[]arr,int idx) {
       
        if(idx == arr.length) return;
        System.out.println(arr[idx]+" ");
        recprint(arr, idx+1);
    }
     public static void revrecprint(int[]arr,int idx) {
         Arrays.sort(arr);
        if(idx == arr.length) return;
        revrecprint(arr, idx+1);  // call pehle fir kaam toh cheeze reverse hoti h
         System.out.println(arr[idx]);
    }
    public static boolean  linear(int[]arr,int ele,int idx) {
        if(idx == arr.length) return false;
        if(arr[idx] == ele) return true;
        return linear(arr,ele, idx+1);
    
    }
}
