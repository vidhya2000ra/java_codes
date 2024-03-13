package collectionInJava.ArrayList;

import java.util.ArrayList;
import java.util.List;

public class Example3 {
    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<Integer>(List.of(1,2,3,4,5,6,7,8,9,6,78,65,54,53));
        A.replaceAll(integer -> integer == 1?11:integer);
        System.out.println(A);
        List<Integer> subListA =A.subList(5,7);
        System.out.println(subListA);
    }
}
