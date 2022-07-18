package all_tasks;

import java.util.Arrays;

public class SortArray {
    public static void main(String[] args) {
        /**
         Given an array of integers nums, sort the array in ascending order.
         Example 1:
         Input: nums = [5,2,3,1]
         Output: [1,2,3,5]
         */

        int arr[] = new int[]{33, 23, 66, 11, 3, 7};
        int temp;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        for (int each : arr) {
            System.out.println(each);
        }

    }


}
