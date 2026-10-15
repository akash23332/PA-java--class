package Stack;

import java.util.*;

public class Decode_String {

    public static String decodeString(String s) {

        Stack<Integer> countStack = new Stack<>();
        Stack<String> stringStack = new Stack<>();

        int num = 0;
        String current = "";

        for (char ch : s.toCharArray()) {

            // If character is a digit
            if (Character.isDigit(ch)) {

                num = num * 10 + (ch - '0');

            }

            // Opening bracket
            else if (ch == '[') {

                countStack.push(num);
                stringStack.push(current);

                num = 0;
                current = "";
            }

            // Closing bracket
            else if (ch == ']') {

                int count = countStack.pop();
                String previous = stringStack.pop();

                StringBuilder temp = new StringBuilder(previous);

                for (int i = 0; i < count; i++) {
                    temp.append(current);
                }

                current = temp.toString();
            }

            // Normal character
            else {

                current += ch;
            }
        }

        return current;
    }

    public static void main(String[] args) {

        String s = "3[a2[c]]";

        System.out.println(decodeString(s));
    }
}