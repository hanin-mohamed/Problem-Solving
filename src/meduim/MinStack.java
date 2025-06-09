package meduim;

import java.util.Stack;
class MinStack {
    private Stack<Integer> mainStack;
    private Stack<Integer> minStack;

    public MinStack() {
        mainStack = new Stack<>();
        minStack = new Stack<>();
    }

    public void push(int val) {
        mainStack.push(val);
        if (minStack.isEmpty() || val <= minStack.peek()) {
            minStack.push(val);
        }
    }

    public void pop() {
        if (mainStack.peek().equals(minStack.peek())) {
            minStack.pop();
        }
        mainStack.pop();
    }

    public int top() {
        if (mainStack.isEmpty()) {
            return Integer.parseInt(null);
        }
        return mainStack.peek();
    }

    public int getMin() {
        if (minStack.isEmpty()) {
            return Integer.parseInt(null);
        }
        return minStack.peek();
    }

    public static void main(String[] args) {
        MinStack stack = new MinStack();
        stack.push(-3);
        stack.push(0);
        stack.push(-2);
        System.out.println(stack.getMin());
        stack.pop();
        System.out.println(stack.top());
    }
}
