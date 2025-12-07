import java.util.HashSet;
import java.util.Set;

public class array17 {

   // APPROACH 1 -> NESTED LOOP 
    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 2, 2};
        
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    System.out.println("Duplicate: " + arr[i]);
                }
            }
        }
    }

    // APPROACH TWO -> ARRAY LIST

    // public static void main(String[] args) {
    //     int[] arr = {1, 3, 4, 2, 2};
    //     Set<Integer> seen = new HashSet<>();
        
    //     for (int num : arr) {
    //         if (!seen.add(num)) {
    //             System.out.println("Duplicate: " + num);
    //         }
    //     }
    // }

}
    
