package collectionInJava.linkedList;

import java.util.LinkedList;
import java.util.List;

public class Example2 {
    public static void main(String[] args) {
        LinkedList<Character> ll= new LinkedList<>(List.of('A','B','C','D'));

        ll.offer('E');
        ll.offerFirst('A');
        ll.offerLast('G');

        // peek
        Character c= ll.peek();// return the element pointed by head
        System.out.println(c);

        c = ll.peekLast();
        System.out.println(c);

        c = ll.peekFirst();
        System.out.println(c);

        c = ll.poll(); // retrieves and removed last
        System.out.println("Removed Element : " + c );

        System.out.println("Removed First Element :" + ll.pollFirst());
        System.out.println("Removed Last Element :" + ll.pollLast());

        //ll can be used as stack also

        LinkedList<Integer>stack = new LinkedList<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);

        System.out.println(stack);//last in first out
        System.out.println("Removed Element:" + stack.pop());
        System.out.println("Peek Element:" + stack.peek());
    }
}
