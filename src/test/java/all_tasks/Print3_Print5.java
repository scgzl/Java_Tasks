package all_tasks;

public class Print3_Print5 {
    public static void main(String[] args) {
    /* Write a short program that prints each number from 1 to 100 on a new line.

        For each multiple of 3, print "evolv" instead of the number.

        For each multiple of 5, print "Rocks" instead of the number.

     */

        for (int i = 1; i < 100 ; i++) {

            if(i%3==0){
                System.out.println("evolv");
            } else if(i%5==0){
                System.out.println("Rocks");
            } else {
                System.out.println(i);
            }
        }


    }
}
