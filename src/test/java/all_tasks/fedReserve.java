package all_tasks;

public class fedReserve {

    public static void main(String[] args) {

        String x = "asda-9asdsa67asd6";

        // get the sum of numbers

        int total =0;

        char[] ch = x.toCharArray();

        for(char each: ch){
            if(Character.isDigit(each)){
                total += Integer.valueOf(""+each);
            }
        }

        System.out.println("total = " + total);


    }
}
