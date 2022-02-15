package Algorithms.ValidParentheses;

import java.util.HashMap;
import java.util.Stack;

public class ValidParentheses {
    public static void main(String[] args) {

        String s1 = "()[]{}";
        String s2 = "(}{)";
        System.out.println(validParenthesis(s1));
        System.out.println(validParenthesis(s2));
    }

    private static boolean validParenthesis(String s) {
        HashMap<Character, Character> map = new HashMap<>();
        map.put('(', ')');
        map.put('[', ']');
        map.put('{', '}');

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char curr = s.charAt(i);

            if (map.containsKey(curr)) {
                stack.push(curr);
            } else if (map.containsValue(curr)) {
                if (!stack.empty() && map.get(stack.peek()) == curr) {
                    stack.pop();
                } else {
                    return false;
                }
            }
        }

        return stack.empty();
    }
}
