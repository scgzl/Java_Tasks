package all_tasks;

import java.util.Arrays;

public class ConcatTwoArrays {
    public static void main(String[] args) {

        int[] arr1 = {12, 24, 654, 66, 33};
        int[] arr2 = {23, 45, 77, 9, 88};

        System.out.println(Arrays.toString(concatTwoArrays(arr1, arr2)));
    }

    public static int[] concatTwoArrays(int[] arr1, int[] arr2) {
        int [] result = new int[arr1.length + arr2.length];
        int i = 0;

        for (int each : arr1) {
            result[i] = each;
            i++;
        }
        for (int each : arr2) {
            result[i] = each;
            i++;
        }
        return result;

    }
}
