package meduim;

import java.util.Stack;

public class RmvStarFromStr {
    public String removeStars(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '*') {
                if (!stack.isEmpty())
                    stack.pop();
            } else {
                stack.push(s.charAt(i));
            }

        }
        StringBuilder res = new StringBuilder();
        while (!stack.isEmpty()) {
            res.append(stack.pop());
        }
        res.reverse();
        return res.toString();
    }

    public static void main(String[] args) {
        RmvStarFromStr r = new RmvStarFromStr();
        System.out.println(r.removeStars("leet**cod*e"));
    }
}
