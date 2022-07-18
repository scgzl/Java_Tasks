package all_tasks;

import java.util.Arrays;

public class ReturnMaxArray {
    public static void main(String[] args) {

        int []xArr= {123,22,66,8864,900,10999};

        //print  largest element of the array

        System.out.println("returnMaxArrayElements(arr) = " + returnMaxArrayElements(xArr));

    }
    static int returnMaxArrayElements(int[] arr){
        int max=0;
        for (int j : arr) {
            if (j > max) {
                max = j;
            }
        }
        return  max;
    }

}
