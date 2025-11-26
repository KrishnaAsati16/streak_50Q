import java.util.*;
public class array6 {
    
    
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {3, 4, 5, 6, 7};

        // UNION
//  // Using HashSet to store unique elements
        Set<Integer> union = new HashSet<>();

        for (int x : arr1)
            union.add(x);
        for (int x : arr2)
            union.add(x);

        System.out.println("Union: " + union);

        // intersection
    Set<Integer> set = new HashSet<>();
        Set<Integer> intersection = new HashSet<>();

        for (int x : arr1)
            set.add(x);

        for (int x : arr2)
            if (set.contains(x))
                intersection.add(x);

        System.out.println("Intersection: " + intersection);
    }
}

    

