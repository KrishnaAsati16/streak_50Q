public class String12 {
    public static int lengthOfLongestSubstring(String s) {
        int[] lastIndex = new int[256]; // ASCII size
        for (int i = 0; i < 256; i++) {
            lastIndex[i] = -1; // initialize
        }

        int left = 0, maxLength = 0;

        // Single loop over characters
        for (int right = 0; right < s.length(); right++) {
            char c = s.charAt(right);

            // If character seen before, move left pointer
            if (lastIndex[c] >= left) {
                left = lastIndex[c] + 1;
            }

            // Update last seen index
            lastIndex[c] = right;

            // Update max length
            int currentLength = right - left + 1;
            if (currentLength > maxLength) {
                maxLength = currentLength;
            }
        }

        return maxLength;
    }

    public static void main(String[] args) {
        String s = "chotabheemrajugajguu";
        System.out.println("Longest substring length: " + lengthOfLongestSubstring(s));
    }
}
    
