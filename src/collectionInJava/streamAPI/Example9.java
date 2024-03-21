package collectionInJava.streamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Example9 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(3,1,2,5,1,2,9);
        Optional<Integer> minNumber = numbers.stream().min(Integer::compareTo);
        System.out.println(minNumber.isPresent());
        System.out.println(minNumber.get());
    }
}
