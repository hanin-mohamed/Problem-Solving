package easy;

import java.util.Stack;

public class ValidParentheses {
    public boolean isValid(String s) {
        if (s.length() % 2 != 0) return false;
        Stack<Character> stack = new Stack<Character>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '{' || s.charAt(i) == '[' || s.charAt(i) == '(') {
                stack.push(s.charAt(i));
            }
            else {
                if (stack.isEmpty()) return false;
                else if(  (stack.lastElement() == '(' && s.charAt(i) == ')' )||(stack.lastElement() == '{' && s.charAt(i) == '}')||(stack.lastElement() == '[' && s.charAt(i) == ']')){
                    stack.pop();
                }
                else return false;
            }
        }
            return stack.isEmpty();
    }

    public static void main(String[] args) {

        ValidParentheses v = new ValidParentheses();
        System.out.println(v.isValid("([])"));

    }
}