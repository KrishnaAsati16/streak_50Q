 import java.util.Scanner;
public class String13 {
   
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // First string
        System.out.println("Enter first string:");
        String str1 = sc.next();
        int[] freq1 = new int[256];

        // Second string
        System.out.println("Enter second string:");
        String str2 = sc.next();
        int[] freq2 = new int[256];

        // Count frequency of characters in first string
        for (int i = 0; i < str1.length(); i++) {
            freq1[str1.charAt(i)]++;
        }

        // Count frequency of characters in second string
        for (int i = 0; i < str2.length(); i++) {
            freq2[str2.charAt(i)]++;
        }

        // Compare frequency arrays
        boolean flag = true;
        for (int i = 0; i < 256; i++) {
            if (freq1[i] != freq2[i]) {
                flag = false;
                break;
            }
        }

        // Output result
        if (flag)
            System.out.println("Anagrams");
        else
            System.out.println("Not anagrams");

        sc.close();
    }
}

    

