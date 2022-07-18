package all_tasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MoveZerosToEndArraylist {

    public static void main(String[] args) {

        Integer[]ab = {123,2,0,23,0,11,7,98};
        List<Integer> list = new ArrayList<Integer>(Arrays.asList(ab));

        System.out.println("list = " + list);

    }


     /*
    write a program that can move all the zeros to the end of the List of integers
     */

    public static List<Integer> moveZerosToTheEnd(List<Integer> list) {
        int originalSize = list.size();
        list.removeAll(Arrays.asList(0));
        int newSize = list.size();
        int totalNumberOfZeros = originalSize - newSize;

        for (int i = 0; i < totalNumberOfZeros; i++) {
            list.add(0);
        }

        return list;
    }

}
