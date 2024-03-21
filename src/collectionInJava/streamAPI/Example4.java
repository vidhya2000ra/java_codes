package collectionInJava.streamAPI;

import java.util.function.Predicate;

public class Example4 {
    public static void main(String[] args) {
        Predicate<Integer> p = new Predicate<Integer>() {
            @Override
            public boolean test(Integer integer) {
                if(integer% 2==0)
                    return true;
                return false;
            }
        };
    }
}
