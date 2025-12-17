// - 1 → "one 1" → 11
// - 11 → "two 1s" → 21
// - 21 → "one 2, one 1" → 1211
// - 1211 → "one 1, one 2, two 1s" → 111221
// - … and so on.

public class String6 {

              public static String countAndSay(int n) {
        if (n == 1) return "1";  

        
        String prev = countAndSay(n - 1);
        StringBuilder sb = new StringBuilder();

        int count = 1;
        for (int i = 1; i < prev.length(); i++) {
            if (prev.charAt(i) == prev.charAt(i - 1)) {
                count++;
            } else {
                sb.append(count).append(prev.charAt(i - 1));
                count = 1;
            }
        }
        // Append the last group
        sb.append(count).append(prev.charAt(prev.length() - 1));

        return sb.toString();
    }

    public static void main(String[] args) {
        int n = 7; 
        System.out.println("The " + n + "th term of Count and Say sequence is:");
        System.out.println(countAndSay(n));
    }
}

    