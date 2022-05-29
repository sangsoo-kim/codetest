package stack;

import java.util.Stack;

public class Stack1 {

    public static void main(String args[]){

        Stack st = new Stack<Integer>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        st.push(6);
        st.push(7);
        st.push(8);
        st.push(9);
        st.push(10);

        System.out.println("PEEK : "+st.peek());
        System.out.println(st);
        System.out.println("SEARCH : "+st.search(7));
        System.out.println("POP : "+st.pop());
        System.out.println("POP : "+st.pop());
        System.out.println("POP : "+st.pop());
        System.out.println(st);
        System.out.println("SEARCH : "+st.search(10));


    }

}
