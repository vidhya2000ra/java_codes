package collectionInJava.ArrayList;

import java.util.*;

/**
 * Implementation of  Dynamic Array
 * #Note: that this is implementation is not Synchronize
 */
public class Example1 {
    public static void main(String[] args) {
        ArrayList<Integer> arr1 = new ArrayList<>();
        ArrayList<Integer> arr2 = new ArrayList<>(List.of(2,4,5,6,9,8,56));

        ArrayList<Integer> arr3 = new ArrayList<>(30);
        System.out.println("Array1 :" + arr1);
        System.out.println("Array2 :" + arr2);
        System.out.println("Array3 :" + arr3);

        arr1.add(35);
        arr1.add(0,86);

        System.out.println(arr1);

        Comparator<Integer> c = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                if(o1.equals(o2)){
                    return 0;
                }else if (o1<o2){
                    return 1;
                }else{
                    return -1;
                }
            }
        };

        arr3.addAll(List.of(1,2,3,4,5,6,7,8,9));
        System.out.println("Array :" + arr3);
        arr3.sort(c);
        System.out.println("Array Sorted in Reverse :" + arr3);

        Collections.sort(arr3);
        System.out.println("Natural sorting order:" + arr3);
    }
}
