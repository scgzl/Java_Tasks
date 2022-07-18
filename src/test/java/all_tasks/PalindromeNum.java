package all_tasks;

public class PalindromeNum {
    public static void main(String[] args) {
        /**
         Given an integer x, return true if x is palindrome integer.
         An integer is a palindrome when it reads the same backward as forward.
         For example, 121 is a palindrome while 123 is not.
         Example 1:
         Input: x = 121
         Output: true
         Explanation: 121 reads as 121 from left to right and from right to left.
         Example 2:
         Input: x = -121
         Output: false
         Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.
         Example 3:
         Input: x = 10
         Output: false
         Explanation: Reads 01 from right to left. Therefore it is not a palindrome.
         */

        int a = 1331;
        System.out.println("isPalindrome(a) = " + isPalindrome(a));

    }
    public static boolean isPalindrome(int x) {
        boolean isPalindromeNum = false;

        String str = Integer.toString(x);
        StringBuilder reverseStr = new StringBuilder(str);
        String reversedNum = reverseStr.reverse().toString();
        if (reversedNum.equals(str)) 
           isPalindromeNum = true;
        
        return isPalindromeNum;
    }

}
