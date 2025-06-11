package string;

import java.util.Stack;


public class ValidParentheses {
    public static void main(String[] args) {
        String value = "[{()]";
        System.out.println(validParenthesesCheck(value));
    }

    private static boolean validParenthesesCheck(String value) {
        char[] chars = value.toCharArray();
        boolean isValid = true;
        Stack<Character> stack = new Stack<>();
        for (Character ch : chars) {
            if (ch == '[' || ch == '{' || ch == '(') {
                stack.push(ch);
            } else {
                if (stack.isEmpty()) {
                    return false;
                }

                char popElement = stack.pop();
                if (ch == ')' && popElement != '(' ||
                        ch == '}' && popElement != '{' ||
                        ch == ']' && popElement != '[') {
                    return false;
                }
            }

        }
        return stack.isEmpty();
    }
}

