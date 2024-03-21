package collectionInJava.queue;

import java.util.ArrayDeque;
import java.util.List;
import java.util.Queue;

public class Example1 {
    public static void main(String[] args) {
        Queue<Character> c1= new ArrayDeque<Character>(List.of('A','B','C'));
        c1.add('V');
        System.out.println(c1);
        c1.remove('V');
        System.out.println(c1);
        c1.peek();
        System.out.println(c1);
        c1.poll();
        System.out.println(c1);
        c1.offer('B');
        System.out.println(c1);
        c1.toString();
        System.out.println(c1);
        c1.clear();
        System.out.println(c1);

    }
}
