public class missarr {
    public static void main(String[] args) {
        int[] a= {9,6,4,2,3,5,7,0,1};
        misnum(a);
    }

    private static void misnum(int[] arr) {
        int n = arr.length+1;
        int sumN = n*(n+1)/2;
        int sum=0;
        for(int i = 0;i<arr.length;i++){
            sum+=arr[i];
        }
        int diff=sumN-sum;
        System.out.println(diff);
    }
}
