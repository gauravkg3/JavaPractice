package CodingShuttle.Stack;

import java.util.ArrayDeque;

public class InfixToPostfix {
    public static void main(String[] args) {

        String expression = "a + b - d * ( e + f ) * g";

        System.out.println(infixToPostfix(expression));

    }

    public static String infixToPostfix(String s) {
        String tokens[] = s.split(" ");

        ArrayDeque<String> stack = new ArrayDeque<>();
        StringBuilder sb = new StringBuilder();

        for (String token : tokens) {
            if (token.equals("(")) {
                stack.push(token);
            } else if (isOperator(token)) //+,-,*,/
            {
                while (!stack.isEmpty() && precedance(stack.peek()) >= precedance(token)) {
                    String temp = stack.pop();
                    sb.append(temp).append(" ");
                }
                stack.push(token);
            } else if (token.equals(")")) {
                while (!stack.isEmpty() && !stack.peek().equals("(")) {
                    String temp = stack.pop();
                    sb.append(temp).append(" ");
                }
                stack.pop();
            } else {
                sb.append(token).append(" ");
            }
        }
        while (!stack.isEmpty()) {
            String temp = stack.pop();
            sb.append(temp).append(" ");
        }
        return sb.toString();
    }

    public static boolean isOperator(String s) {
        return s.equals("+") || s.equals("-") || s.equals("*") || s.equals("/");
    }

    public static int precedance(String s) {
        return switch (s) {
            case "^" -> 3;
            case "/", "*" -> 2;
            case "+", "-" -> 1;
            default -> -1;
        };
    }
}
