package all_tasks;

public class LeapYear {
    public static void main(String[] args) {

        System.out.println(leapYear(1996));

    }
    /*
    on every year that is evenly divisible by 4
    except every year that is evenly divisible by 100
    unless the year is also evenly divisible by 400
    for example 1997 is not a leap year but 1996 is, 1900 is not a leay year but 2000 is.
     */

    static boolean leapYear(int num){

        if((num%4==0 && num %100!=0)||(num%400==0)){
            return true;
        } else return  false;

    }
}
