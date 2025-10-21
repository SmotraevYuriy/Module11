package hard2;

import java.util.Stack;

public class Checker {

    public static boolean valid(String sequence) {
        Stack<Character> stack = new Stack<>();
        for (char ch : sequence.toCharArray()) {
            if (openingBracket(ch)) {
                stack.push(ch);
            } else if (closingBracket(ch)) {
                if (stack.isEmpty() || !matching(stack.pop(), ch)) {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }


    private static boolean openingBracket(char ch) {
        return ch == '(' || ch == '{' || ch == '[';
    }

    private static boolean closingBracket(char ch) {
        return ch == ')' || ch == '}' || ch == ']';
    }


    private static boolean matching(char open, char close) {
        return (open == '(' && close == ')') ||
                (open == '{' && close == '}') ||
                (open == '[' && close == ']');
    }
}
