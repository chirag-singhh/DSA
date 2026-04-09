
import java.util.ArrayList;

public class removedup {
    public static void main(String[] args) {
        int nums[] = {1,1,2};
        ArrayList arr = new ArrayList<>();
        for (int n : nums) {
            if (!arr.contains(n)) {
                arr.add(n);
            }
        }
        System.out.println(arr  );
            

    }
}
