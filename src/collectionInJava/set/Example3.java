package collectionInJava.set;

import java.util.TreeSet;

public class Example3 {
    public static void main(String[] args) {
        TreeSet<String> namesTreeSet = new TreeSet<String>();

        namesTreeSet.add("Vidhya");
        namesTreeSet.add("Aditi");
        namesTreeSet.add("Ravi");
        namesTreeSet.add("Kiyara");
        namesTreeSet.add("Mayra");
        namesTreeSet.add("Jerry");

        namesTreeSet.forEach(System.out::println);
//        System.out.println(namesTreeSet);
    }
}
