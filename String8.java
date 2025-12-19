import java.util.Scanner;
public class String8 {
//     public static int myAtoi(String s) {
//         if (s == null || s.length() == 0) return 0;

//         int i = 0, n = s.length();
//         // Step 1: Skip leading whitespaces
//         while (i < n && s.charAt(i) == ' ') {
//             i++;
//         }

//         // Step 2: Handle sign
//         int sign = 1;
//         if (i < n && (s.charAt(i) == '+' || s.charAt(i) == '-')) {
//             sign = (s.charAt(i) == '-') ? -1 : 1;
//             i++;
//         }

//         // Step 3: Convert digits
//         long result = 0; // use long to detect overflow
//         while (i < n && Character.isDigit(s.charAt(i))) {
//             int digit = s.charAt(i) - '0';
//             result = result * 10 + digit;

//             // Step 4: Handle overflow
//             if (sign == 1 && result > Integer.MAX_VALUE) {
//                 return Integer.MAX_VALUE;
//             }
//             if (sign == -1 && -result < Integer.MIN_VALUE) {
//                 return Integer.MIN_VALUE;
//             }
//             i++;
//         }

//         return (int) (sign * result);
//     }

//     // Quick test
//     public static void main(String[] args) {
//         System.out.println(myAtoi("42"));            // 42
//         System.out.println(myAtoi("   -42"));        // -42
//         System.out.println(myAtoi("4193 with words"));// 4193
//         System.out.println(myAtoi("words 987"));     // 0
//         System.out.println(myAtoi("-91283472332"));  // -2147483648 (clamped)
//     }


    public static void main(String[] args) {
        String s = "789";
        Scanner sc = new Scanner(s);
        int num = sc.nextInt();
        System.out.println(num); // 789
        sc.close();
    }
}


