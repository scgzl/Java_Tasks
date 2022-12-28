package all_tasks;

public class SearchInsertPosition {
    public static void main(String[] args) {
        /*
         Given a sorted array of distinct integers and a target value, return the index if the target is found. If not, return the index
         where it would be if it were inserted in order.
         You must write an algorithm with O(log n) runtime complexity.
         Example 1:
         Input: nums = [1,3,5,6], target = 5
         Output: 2
         */

        int []num  = {1};
        System.out.println(searchInsert(num, 3));
    }

    public static int searchInsert(int[] nums, int target) {

        int a = 0;
        for (int i = 0; i < nums.length-1; i++) {
            if(nums[i]==target){
              a=i;
            } else if(nums[i+1]>target && target>nums[i]){
                a=i+1;
            } else if( target >nums[i+1]){
                a = i+2;
            } else if (target<nums[0]){
                a = 0;
            }
        }
        return a;
    }

}
