package collectionInJava.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Example2 {
    public static void main(String[] args) {
        Map<String,Integer> numbers = new HashMap<>();
        //Adding data in the map

        numbers.put("Vidhya",1);
        numbers.put("Bhavika",2);
        numbers.put("Kavya",3);
        numbers.put("Ravi",4);
        numbers.put("Manvi",5);
        System.out.println("Content of Map-1:" + numbers);

        Map<String,Integer> numbers1 = new HashMap<>();
        numbers1.put("Vidha", 15);
        System.out.println("Content of Map-2:" + numbers);

        numbers.putAll(numbers1);
        System.out.println("Content of Map-1 after adding the Map-2:" + numbers);

        numbers.putIfAbsent("Vidha",15);
        System.out.println(numbers);

        Integer x = numbers.get("Vidhya");
        System.out.println("Key Associated With{'Vidhya': "+ x +"}");

        x = numbers.getOrDefault("Ravi",4);
        System.out.println(x);

        boolean result = numbers.containsKey("nine");
        System.out.println("'nine' key is present in hashMap :" + result);

        result= numbers.containsKey("Vidhya");
        System.out.println("'Vidhya' is present in hashMap :" + result);

        numbers.replace("Manvi",12345);
        System.out.println("HashMap after replacing the key-value pair :" + numbers);

        numbers.replace("Kavya",257,555);
        System.out.println("Content of hashMap :" + numbers);

        numbers.remove("Bhavika");
        System.out.println("Content of hashMap after removal of 'Bhavika' :" + numbers);

        numbers.remove("Vidhya",1);
        System.out.println("Content of hashMap after removal of 'Vidhya' :" + numbers);

        Set<String> keySet = numbers.keySet();
        System.out.println("Keys present in hashMap :" + keySet);

        Collection<Integer> values = numbers.values();
        System.out.println("Values are present in hashMap :" + values);

        Set<Map.Entry<String,Integer>> keyvalue = numbers.entrySet();
        System.out.println(keyvalue);
    }
}
