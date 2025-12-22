public class String11 {
    
    public int compress(char[] chars) {
        int i = 0, k = 0;

        while (i < chars.length) {
            int cnt = 1;

            while (i + cnt < chars.length && chars[i] == chars[i + cnt]) {
                cnt++;
            }

            chars[k++] = chars[i];

            if (cnt > 1) {
                for (char ch : Integer.toString(cnt).toCharArray()) {
                    chars[k++] = ch;
                }
            }

            i += cnt;
        }

        return k;
    }
    public static void main(String[] args) {
          String11 obj = new String11();
        
          char[] chars = {'a','a','b','b','c','c','c'};
        int newLength = obj.compress(chars);

        System.out.println("Compressed length: " + newLength);

        System.out.print("Compressed array: ");
        for (int i = 0; i < newLength; i++) {
            System.out.print(chars[i] + " ");
        }
    }
    }
