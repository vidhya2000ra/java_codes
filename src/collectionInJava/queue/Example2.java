package collectionInJava.queue;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;


public class Example2 {
    public static void main(String[] args) {
         LinkedList<Integer> l1= new LinkedList<Integer>(List.of(1,2,4));
         LinkedList< Integer> l2= new LinkedList<Integer>(List.of(2,4,5));
         LinkedList<Integer> l3= new LinkedList<Integer>(List.of(7,8,9));
         LinkedList<Integer> l4= new LinkedList<Integer>(List.of(55,66,77));

         Queue<LinkedList<Integer>> q= new ArrayDeque<>();
         q.add(l1);
         q.add(l2);
         q.add(l3);
         q.add(l4);
        System.out.println(q);

         q.poll();
        System.out.println(q);

        q.peek();
        System.out.println(q);

         q.element();
        System.out.println(q);

        q.remove();
        System.out.println(q);

        q.removeAll(l1);
        System.out.println(q);


        l1.offer(2);
        System.out.println(q);

        for (LinkedList<Integer> a:q){
            System.out.println(a);
        }

    }
}
