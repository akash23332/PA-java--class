package Stack;

import java.util.*;

public class Reverse_polish_notation {

    public static int evalRPN(String[] tokens) {

        Stack<Integer> stack = new Stack<>();

        for (String token : tokens) {

            if (token.equals("+") || token.equals("-") ||
                    token.equals("*") || token.equals("/")) {

                int b = stack.pop();
                int a = stack.pop();

                int res = 0;

                if (token.equals("+"))
                    res = a + b;

                else if (token.equals("-"))
                    res = a - b;

                else if (token.equals("*"))
                    res = a * b;

                else
                    res = a / b;

                stack.push(res);

            } else {
                stack.push(Integer.parseInt(token));
            }
        }

        return stack.pop();
    }

    public static void main(String[] args) {

        String[] tokens = {"1", "2", "+", "3", "*"};

        System.out.println(evalRPN(tokens));
    }
}