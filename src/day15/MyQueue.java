package day15;

import java.util.Stack;

public class MyQueue {
    private int front;
    Stack<Integer> s1=new Stack<>();
    Stack<Integer> s2=new Stack<>();
    public MyQueue() {
    }

    public void push(int x) {
        if(s1.isEmpty())
            front=x;
        s1.push(x);
    }

    public int pop() {
        if (s2.isEmpty()) {
            while (!s1.isEmpty()) {
                s2.push(s1.pop());
            }
        }
        return s2.pop();
    }

    public int peek() {
        if(s2.isEmpty())
            return front;
        return s2.peek();

    }

    public boolean empty() {
        return s1.isEmpty()&&s2.isEmpty();

    }
}
