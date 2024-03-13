package collectionInJava.Stacks;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Example3 {
    public static void main(String[] args) {
        //clear
        Collection<Character> c1 = new ArrayList<>();
        Collection<Character> c2 = new ArrayList<>(List.of('A','B','C','D','E','F'));
        c2.clear();
        System.out.println("Collection c2 :" + c2);

        // size
        Collection<Integer> c3 = new ArrayList<>(List.of(1,2,3,4,5,8,78,85,55));
        c3.size();
        System.out.println("Collection c3 : " + c3);

        // toArray
        Collection<String> c4 = new ArrayList<>(List.of("Vidhya","Diya","Yuvani","Manvi","Tina"));
        c4.toArray();
        System.out.println("Collection toArray c4: " + c4);

        Collection<String> c5 = new ArrayList<>(List.of("Bhavika", "Ruhani","Twinkle","Harry", "Niharika"));
        c5.toArray();
        System.out.println("Collection toArray c5 : " + c5);

        //boolean contains
        Collection<Character> c6 = new ArrayList<>(List.of('B','D','F','I','K','R','V','M','J'));
        boolean result = c6.containsAll(c6);
        System.out.println("Collection of ContainsAll :" + c6);

        // boolean isEmpty
        Collection<Character> c7 = new ArrayList<>(List.of('V','I','D','H','Y','A'));
        boolean result1 = c7.isEmpty();
        System.out.println("Collection of string :" + c7);
        System.out.println(c6);

    }
}
