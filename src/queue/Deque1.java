package queue;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class Deque1 {

    public static void main(String args[]){

        Deque qu = new LinkedList<Integer>();
        qu.offer(1);
        qu.offer(2);
        qu.offer(3);
        qu.offer(4);
        qu.offerFirst(5);
        qu.offer(6);
        qu.offer(7);
        qu.offer(8);
        qu.offer(9);
        qu.offer(10);

        System.out.println("PEEK : "+qu.peek());
        System.out.println(qu);
        System.out.println("POLL : "+qu.poll());
        System.out.println("POLL LAST : "+qu.pollLast());
        System.out.println("POLL : "+qu.poll());
        System.out.println("POLL : "+qu.poll());
        System.out.println(qu);


    }

}
