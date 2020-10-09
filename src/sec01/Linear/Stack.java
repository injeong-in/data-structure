package sec01.Linear;
import java.util.*;
public class Stack<T> {
    static class Node<T> {
        private T data;
        private Node<T> next;

//        public Node<T>(T data) {
//            this.data = data;
//        }
//
//        private Node<T> top;
//
//        public T pop() {
//            if(top == null) {
//                throw new ExptyStackException();
//            }
//        }

        public static void main(String[] args) {
            java.util.Stack<Integer> s = new java.util.Stack<>();
            System.out.println("Stack created :");




            for (int i=0; i<10; i++)
                s.push(i);

                System.out.println("1pop: " + s.pop());
            System.out.println("2pop: " + s.pop());
            System.out.println("3pop: " + s.pop());
            System.out.println("4pop: " + s.pop());
            s.pop();
            s.pop();
            s.pop();
            System.out.println("stack top :" + s.peek());
        }
    }


}
