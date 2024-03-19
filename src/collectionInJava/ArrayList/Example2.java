package collectionInJava.ArrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Example2 {
    public static void main(String[] args) {
        ArrayList<Character> arr1= new ArrayList<>();

        boolean result = arr1.add('V');

        System.out.println(arr1);
        System.out.println("Status of Append: " + result);

        arr1.add(0,'R');
        System.out.println("Array :" +arr1);

        arr1.addAll(List.of('K','M','E'));
        System.out.println("Array after the allAll(Collection<>) : " + arr1);

        arr1.addAll(2,List.of('P','S','T'));
        System.out.println("Array after the allAll(int,Collection<>) :" + arr1);

        ArrayList<Character> arr2= (ArrayList<Character>)arr1.clone();
        System.out.println("Shallow Copy Array :" + arr2);
        System.out.println("Original Copy Array:" + arr1);

        arr1.set(1,'X');
        System.out.println("Shallow Copy Array :" + arr2);
        System.out.println("Original Copy Array : " + arr1);

        result = arr1.contains('A');
        System.out.println("Collection contains 'A':" + result);

        arr1.ensureCapacity(15);

        for (int x : arr2){
            System.out.println((char)x);
        }
        System.out.println(arr1.size());

        arr1.forEach(System.out::println);

        Character c =arr1.get(3);
        System.out.println(c);

        System.out.println("Index of X :" + arr1.indexOf('X'));
        System.out.println("IsEmpty : " + arr1.isEmpty());
        Iterator<Character> it = arr1.iterator();
        System.out.println("Iterator:");
        while(it.hasNext()){
            System.out.print(it.next() + "");
        }

        arr1.add('E');
        System.out.println("Last Index of E" + arr1.lastIndexOf('E'));
//        System.out.println("Removed Element :" + arr1.remove('E'));
        arr1.removeAll(List.of('X','Z'));
        arr1.remove(3);
    }
}
