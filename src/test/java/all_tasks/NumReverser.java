package all_tasks;

public class NumReverser {
    public static void main(String[]args){

        //how to reverse a number for example
       int a = 21;
        System.out.println("numReverser(a) = " + numReverser(a));

    }

    public static String numReverser(int x){

        String z= Integer.toString(x);
        StringBuilder stringBuilder = new StringBuilder(z);
        String y =stringBuilder.reverse().toString();
        return y ;
    }

}
