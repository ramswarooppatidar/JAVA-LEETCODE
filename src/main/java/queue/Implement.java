package queue;

import java.util.Stack;

public class Implement {
    Stack<Integer> stack1 = null;
    Stack<Integer> stack2 = null;
    public Implement(){
        stack1 = new Stack();
        stack2 = new Stack();
    }
    public void push(int x) {
        stack1.push(x);

    }

    public int pop() {
        if(stack2.isEmpty()){
            while(!stack1.isEmpty()){
                stack2.push(stack1.pop());
            }
        }

        return stack2.pop();
    }

    public int peek() {
        if(stack2.empty()){
            while(!stack1.isEmpty()){
                stack2.push(stack1.pop());
            }
        }

        return stack2.peek();
    }

    public boolean empty() {
        return stack1.isEmpty() && stack2.isEmpty();
    }

    public static void main(String args[]){
        Implement queue = new Implement();
        queue.push(1);
        System.out.println("peek "+queue.peek());
        queue.push(2);
        queue.push(3);
        queue.push(4);
        System.out.println("peek "+queue.peek());
        queue.push(5);
//        System.out.println("peek "+queue.peek());
        System.out.println("pop "+queue.pop());
        System.out.println("empty : "+queue.empty());

        /*
        queue.push(1);
        queue.push(2);
        queue.push(3);
        queue.push(4);

        Queue looks like:

        Front → 1  2  3  4 ← Rear
         */
    }
}
