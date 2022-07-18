package all_tasks;

public class Palindrome {
    public static void main(String[] args) {

        String str = "32madam23";

        System.out.println(isPalindrome(str));

        System.out.println(isPalindrome2(str));


    }
    public static boolean isPalindrome(String str){
       StringBuilder stringBuilder = new StringBuilder(str);

      String reversed = stringBuilder.reverse().toString();

      if (str.equals(reversed)){
          return true;

      }else  return  false;
    }

    public static boolean isPalindrome2(String str){
        int low = 0;
        int high = str.length()-1;
        boolean isPalindromeBoolean = true;

        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(low)!=str.charAt(high)){
                isPalindromeBoolean = false;
                break;
            }
            low++;
            high--;
        }
        return isPalindromeBoolean;

    }
}
