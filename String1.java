public class String1 {
   // approach 1
    public static void main(String[] args) {
        // String str = "Krishna";
        // String reversed = new StringBuilder(str).reverse().toString();
        // System.out.println("Reversed: " + reversed);

        // approach 2

        String str = "Krishna";
        System.out.println("Reversed: " + reverse(str));
    }

    static String reverse(String str) {
        if (str.isEmpty()) return str;
        return reverse(str.substring(1)) + str.charAt(0);
    }
}        
    
     

