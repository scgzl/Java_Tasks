package all_tasks;

import java.util.LinkedHashMap;
import java.util.Map;

public class FrequencyOfCharacters {
    public static void main(String[] args) {
        //write a method that prints the frequency of each character from a string

        String str = "abcsdqdqwq";

        frequencyTest(str);

    }
    public static void frequencyTest(String str){
        //linkedHashmap maintains the order
        Map<Character,Integer> map = new LinkedHashMap<>();

        for (Character each:str.toCharArray()) {
            if(map.containsKey(each)){
                map.put(each,map.get(each)+1);
            }else{
                map.put(each,1);
            }

        }

        System.out.println(map);

    }
}
