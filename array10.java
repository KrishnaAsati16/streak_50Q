import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class array10 {
//     - An element in an array is called a leader if it is greater than or equal to all the elements to its right.
// - The rightmost element is always a leader.
// Example
// Input:
// arr = [16, 17, 4, 3, 5, 2]
// Output:
// [17, 5, 2]
// Explanation:
// - 17 is greater than all elements to its right.
// - 5 is greater than 2.
// - 2 is the last element, so it’s a leader.

// TIME COMPLEXITY PROBLEM USE ARRAYLIST ALSO


// ⚡ Efficient Approach (Right-to-Left Scan)
// Instead of checking each element with all elements to its right (which is O(n²)), we can:
// - Traverse the array from right to left.
// - Keep track of the maximum element seen so far.
// - If the current element is greater than or equal to this maximum, it’s a leader.
// This gives us O(n) time complexity.

    public static void main(String[] args) {
        int[] arr = {16, 17, 4, 3, 5, 2};
        List<Integer> leaders = findLeaders(arr);

        System.out.println("Leaders: " + leaders);
    }

    public static List<Integer> findLeaders(int[] arr) {
        List<Integer> leaders = new ArrayList<>();
        int n = arr.length;

        // Start with the last element as a leader
        int maxFromRight = arr[n - 1];
        leaders.add(maxFromRight);

        // Traverse from second last to first
        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] >= maxFromRight) {
                leaders.add(arr[i]);
                maxFromRight = arr[i];
            }
        }

        // Reverse to maintain original order
        Collections.reverse(leaders);
        return leaders;
    }

    }

