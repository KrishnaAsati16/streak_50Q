import java.util.Scanner;

public class String10 {
       public boolean isPalindrome(String s, int i , int j)
      {
        while(i<j)
        {
            if(s.charAt(i) ==s.charAt(j)){
                i++;
                j--;
            }
            else
            return false;
        }
        return true;
      }

    public boolean validPalindrome(String s)  
    {
              int i =0;
              int j=s.length()-1;

              while(i<j)
              {
                 if(s.charAt(i) ==s.charAt(j))
                 {
                i++;
                j--;
              }
              else
              return isPalindrome(s,i+1,j)  || isPalindrome(s,i,j-1);
              }
             return true;
    }
    public static void main(String[] args)
     {
      Scanner sc = new Scanner(System.in);

        System.out.print("Enter string: ");
        String s = sc.nextLine();

        String10 obj = new String10();
        boolean result = obj.validPalindrome(s);

        System.out.println("Valid Palindrome (after at most one deletion): " + result);

        sc.close();   
    }
}
    

