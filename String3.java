//import java.util.stream.Collectors;

public class String3 {
    public static String removeDuplicates(String str) {
        boolean[] seen = new boolean[256];
        StringBuilder sb = new StringBuilder();

        for (char c : str.toCharArray()) {
            if (!seen[c]) {
                seen[c] = true;
                sb.append(c);
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String input = "banana";
        String result = removeDuplicates(input);
        System.out.println("Original: " + input);
        System.out.println("Without duplicates: " + result);
    }
    //  public static void main(String[] args) {
    //     String str = "programming";
    //     String result = str.chars()
    //                        .distinct()
    //                        .mapToObj(c -> String.valueOf((char) c))
    //                        .collect(Collectors.joining());
    //     System.out.println(result);
    // }
}
    
