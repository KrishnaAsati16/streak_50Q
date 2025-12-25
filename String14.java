public class String14 {

    public static boolean isRotation(String s1, String s2) {
        // Step 1: Check length
        if (s1.length() != s2.length()) {
            return false;
        }
        
        // Step 2: Concatenate s1 with itself
        String temp = s1 + s1;
        
        // Step 3: Check if s2 is a substring of temp
        return temp.contains(s2);
    }

    public static void main(String[] args) {
        String s1 = "ABCD";
        String s2 = "CDAB";

        if (isRotation(s1, s2)) {
            System.out.println(s2 + " is a rotation of " + s1);
        } else {
            System.out.println(s2 + " is NOT a rotation of " + s1);
        }
    }
}
