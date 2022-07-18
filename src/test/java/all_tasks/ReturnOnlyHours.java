package all_tasks;

import java.util.Arrays;

public class ReturnOnlyHours {
    public static void main(String[] args) {
        //given a time return only hours

        //11:00, 9:0, 15:00
        String str = "24:00";

        System.out.println(returnHours(str));

    }

    public static String returnHours(String time){

        String[]arr = time.split(":");

        return arr[0];
    }
}
