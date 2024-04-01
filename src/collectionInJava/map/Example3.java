package collectionInJava.map;

import java.util.HashMap;
import java.util.Map;

public class Example3 {
    public static void main(String[] args) {
        Map<Integer,String> hashMap = new HashMap<>();
        Map<String,Map<Integer,String>> hashMap1 = new HashMap<>();

        hashMap1.put("MH",new HashMap<>());
        hashMap1.get("MH").put(1,"Bhandara");
        hashMap1.get("MH").put(2,"Nagpur");
        hashMap1.get("MH").put(3,"Kanpur");
        hashMap1.get("MH").put(4,"Tumsar");
        hashMap1.get("MH").put(5,"Pune");

        hashMap1.put("UP",new HashMap<>());
        hashMap1.get("UP").put(6,"Mathura");
        hashMap1.get("UP").put(7,"Vrudavan");
        hashMap1.get("UP").put(8,"Gokul");

        hashMap1.put("MP",new HashMap<>());
        hashMap1.get("MP").put(9,"Pachmodi");
        hashMap1.get("MP").put(10,"Balaghat");
        hashMap1.get("MP").put(11,"Ujain");
        hashMap1.get("MP").put(12,"Bhopal");
        System.out.println(hashMap1);


    }
}
