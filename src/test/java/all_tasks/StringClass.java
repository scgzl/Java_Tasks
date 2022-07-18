package all_tasks;

public class StringClass {
    public static void main(String[] args) {

        //String is a special class it is an object it is also a char array
        //String is immutable
        //immutable means -> once you created it you can not change it

        String str = "hello"; // this will be gone by garbage collector
        System.out.println("str.hashCode() = " + str.hashCode());
        str = "hola";
        System.out.println("str.hashCode() = " + str.hashCode());


    }
}
