public class String9 {
     public static int myStrStr(String haystack, String needle) {
        if (needle.isEmpty()) return 0;

        int n = haystack.length();
        int m = needle.length();

        for (int i = 0; i <= n - m; i++) {
            int j = 0;
            while (j < m && haystack.charAt(i + j) == needle.charAt(j)) {
                j++;
            }
            if (j == m) return i;  // full match
        }
        return -1;
    }

    public static void main(String[] args) {
        String text = "Krishna is learning Java";
        String sub = "Java";

        int index = myStrStr(text, sub);
        if (index != -1) {
            System.out.println("Found at index: " + index);
        } else {
            System.out.println("Substring not found.");
        }
    }
}

    

