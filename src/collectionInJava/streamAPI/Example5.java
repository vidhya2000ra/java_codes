package collectionInJava.streamAPI;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.util.stream.Stream;

public class Example5 {
    public static void main(String[] args) {
        // Ways To Generate Stream

        // Stream.of() method

        Stream<Integer> stream1 = Stream.of(1,2,3,4,5,6,7,8,9);
        // Stream using Collection.stream()
        LinkedList<Character> linkedList = new LinkedList<>(List.of('A','B','C'));
        Stream<Character> stream2 = linkedList.stream();

        // Stream using generate()
        Stream<Integer> stream3 = Stream.generate(() -> new Random().nextInt(100));
        stream3.limit(7).forEach(System.out::println);

        Stream<Integer> stream4 = Stream.iterate(0,n->n+2);
        stream4.limit(7).forEach(System.out::println);
    }
}
