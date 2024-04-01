package collectionInJava.map;

import java.util.HashMap;
import java.util.Map;

public class Example1 {
    public static void main(String[] args) {
        Map<Integer,Integer>map = new HashMap<>();
        Map<String,Integer> numbers = new HashMap<>();
        //insert element into map

        numbers.put("Vidhya",1);
        numbers.put("Adhya",2);
        System.out.println(numbers);

    }
}
