public class String15 {
    public static boolean isSubsequence(String s1, String s2) {
        int i = 0, j = 0;
        
        while (i < s1.length() && j < s2.length()) {
            if (s1.charAt(i) == s2.charAt(j)) {
                i++; // move in s1 if match found
            }
            j++; // always move in s2
        }
        
        return i == s1.length(); // if all chars of s1 matched
    }

    public static void main(String[] args) {
        String s1 = "abc";
        String s2 = "ahbgdc";
        
        if (isSubsequence(s1, s2)) {
            System.out.println(s1 + " is a subsequence of " + s2);
        } else {
            System.out.println(s1 + " is NOT a subsequence of " + s2);
        }
    }
}
    
