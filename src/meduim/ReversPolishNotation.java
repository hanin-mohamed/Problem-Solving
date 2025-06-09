package meduim;

import java.util.Stack;

public class ReversPolishNotation {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < tokens.length; i++) {
            if (tokens[i].equals("+")) {
                int num1 = stack.pop();
                int num2 = stack.pop();
                stack.push(num2 + num1);
            }
            else if (tokens[i].equals("-")) {
                int num1 = stack.pop();
                int num2 = stack.pop();
                stack.push(num2 - num1);
            }
            else if (tokens[i].equals("*")) {
                int num1 = stack.pop();
                int num2 = stack.pop();
                stack.push(num2 * num1);
            }
            else if (tokens[i].equals("/")) {
                int num1 = stack.pop();
                int num2 = stack.pop();
                stack.push(num2 / num1);
            }
            else
                stack.push(Integer.parseInt(tokens[i]));
        }
        return stack.peek();
    }
    public static void main(String[] args) {
        ReversPolishNotation rpn = new ReversPolishNotation();
        String[] tokens = {"2","1","+","3","*"};
        System.out.println(rpn.evalRPN(tokens));

    }
}
