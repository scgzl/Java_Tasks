package all_tasks;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        /**Write a function to find the longest common prefix string amongst an array of strings.
         If there is no common prefix, return an empty string "".
         Example 1:
         Input: strs = ["flower","flow","flight"]
         Output: "fl"

         Example 2:
         Input: strs = ["dog","racecar","car"]
         Output: ""
         Explanation: There is no common prefix among the input strings.

         Constraints:
         1 <= strs.length <= 200
         0 <= strs[i].length <= 200
         strs[i] consists of only lowercase English letters.
         */
        String [] str = {"flower","flow","flight"};

        System.out.println("longestCommonPrefix(str) = " + longestCommonPrefix(str));

    }

    public static String longestCommonPrefix(String[] strs) {

        if (strs.length == 0) return "";
        String prefix = strs[0];
        for (int i = 1; i < strs.length; i++)
            while (strs[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty()) return "";
            }
        return prefix;

    }
}
