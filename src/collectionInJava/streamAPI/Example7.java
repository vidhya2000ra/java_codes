package collectionInJava.streamAPI;

import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Example7 {
    public static void main(String[] args) {
        LinkedList<String> namesCollection = new LinkedList<String>(List.of("Vidhya", "Kritika","Raina","Manvi","Janvi"));

        Stream<Integer> namesLengthStream = namesCollection.stream().map(s->s.length());
        namesLengthStream.forEach(System.out::println);

        namesLengthStream = namesCollection.stream().map(s -> s.length());
        // Creating the collection from stream
        List<Integer> llLength = namesLengthStream.collect(Collectors.toList());
        System.out.println(llLength);

        namesLengthStream = namesCollection.stream().map(s -> s.length());
        Set<Integer> namesLengthSet = namesLengthStream.collect(Collectors.toSet());
        System.out.println(namesLengthSet);
    }
}
