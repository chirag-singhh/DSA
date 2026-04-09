// import java.util.Arrays;

// public class largest {
//     public static void main(String[] args) {
//         int[]arr = {9,9,9,9};
//         int carry = 1;
//         int n = arr.length-1;

//         while(n >= 0 && carry!=0){
//             int sum = arr[n]+carry;
//             arr[n]= sum%10;
//             carry = sum/10;
//             n--;
//         }
//          if (carry == 1) {
//             int[] result = new int[arr.length + 1];
//             result[0] = 1;
//             System.arraycopy(arr, 0, result, 1, arr.length);
//             arr = result;
//         }

//         System.out.println(Arrays.toString(arr));


//     }
// }



import java.util.Arrays;

public class largest {
    public static void main(String[] args) {
        int[] arr = {9,9,9,9};

        arr = ress(arr);   

        System.out.println(Arrays.toString(arr));
    }

    public static int[] ress(int[] arr) {
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] < 9) {
                arr[i]++;
                return arr;
            }
            arr[i] = 0;
        }

        int[] res = new int[arr.length + 1];
        res[0] = 1;
        return res;
    }
}

