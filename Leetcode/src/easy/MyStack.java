package easy;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

public class MyStack {
    Queue<Integer> queue;

    public MyStack() {
        queue = new ArrayDeque<>();

    }

    public void push(int x) {
        queue.add(x);
        for (int i = 0; i < queue.size() - 1; i++) {
            queue.add(queue.poll());
        }
    }

    public int pop() {
        return queue.poll();
    }

    public int top() {
        return queue.peek();
    }

    public boolean empty() {
        return queue.isEmpty();
    }


    public static void main(String[] args) {
        MyStack stack = new MyStack();
        stack.push(1);
        stack.push(2);
        System.out.println(stack.top());
        System.out.println(stack.empty());
        System.out.println(stack.pop());
}
}
