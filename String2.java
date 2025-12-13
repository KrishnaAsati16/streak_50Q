public class String2 {
    public static void main(String[] args) {

        String str = "12321";   
        boolean isPalindrome = true;

        int n = str.length();

        for (int i = 0; i < n / 2; i++) {
            if (str.charAt(i) != str.charAt(n - 1 - i)) {
                isPalindrome = false;
                break;
            }
        }

        if (isPalindrome) {
            System.out.println("String is palindrome");
        } else {
            System.out.println("String is not a palindrome");
        }
}
}
