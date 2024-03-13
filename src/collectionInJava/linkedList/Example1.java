package collectionInJava.linkedList;

import java.util.LinkedList;
import  java.util.List;

public class Example1 {
    public static void main(String[] args) {
        LinkedList<Character> ll= new LinkedList<>();
        LinkedList<Character> ll1 = new LinkedList<>(List.of('X','Y','Z'));

        ll.add('A');
        ll.add('B');
        ll.add('C');

        System.out.println(ll);
        System.out.println(ll1);

        System.out.println("The first element in LL:" + ll.element());
        System.out.println("Index of A in LL : " + ll.indexOf('A'));
        System.out.println("Index of B in LL : " + ll.indexOf('B'));

        // insert the Linked List collection into the another linked Lists collection

        ll.addAll(2,ll1);

        ll.addFirst('1');
        ll.addLast('9');
        ll.clear();
        ll.clone();
        ll.add('A');

        System.out.println("First element linked list:" +ll.getFirst());
        System.out.println("Last element linked list: " + ll.getLast());
        System.out.println("Index of 'A': " +ll.indexOf('A'));
        System.out.println("Index of 'A' : " +ll.lastIndexOf('A'));
    }
}
