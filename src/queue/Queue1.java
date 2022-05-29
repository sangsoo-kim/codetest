package queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Queue1 {

    public static void main(String args[]){

        Queue qu = new LinkedList<Integer>();
        qu.offer(1);
        qu.offer(2);
        qu.offer(3);
        qu.offer(4);
        qu.offer(5);
        qu.offer(6);
        qu.offer(7);
        qu.offer(8);
        qu.offer(9);
        qu.offer(10);

        System.out.println("PEEK : "+qu.peek());
        System.out.println(qu);
        System.out.println("POLL : "+qu.poll());
        System.out.println("POLL : "+qu.poll());
        System.out.println("POLL : "+qu.poll());
        System.out.println(qu);


    }

}
