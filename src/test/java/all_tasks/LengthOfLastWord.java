package all_tasks;

public class LengthOfLastWord {
    public static void main(String[] args) {
        /*
         Given a string s consisting of words and spaces, return the length of the last word in the string.

         A word is a maximal substring consisting of non-space characters only.

         Example 2:

         Input: s = "   fly me   to   the moon"
         Output: 4
         Explanation: The last word is "moon" with length 4.
         */

        String s = "a";

        System.out.println(lengthOfLastWord(s));

    }
    public static int lengthOfLastWord(String s){
        int length=0;

        for (int i = s.length()-1; i >= 0; i--) {
            if(s.charAt(i) !=' '){
                length++;
            }else {
                if(length>0){
                    return length;
                }
            }
        }
        return length;
    }

}
