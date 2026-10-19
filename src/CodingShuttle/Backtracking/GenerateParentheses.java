package CodingShuttle.Backtracking;

public class GenerateParentheses {
    public static void main(String[] args) {
        int n = 3;
        generateParentheses(0, n, "", 0, 0);

    }

    public static void generateParentheses(int index, int n, String curr, int open, int close) {
        if (index == 2 * n) {
            System.out.println(curr);
        }
        if (open < n) {
            curr = curr + "(";
            generateParentheses(index + 1, n, curr, open + 1, close);
            curr = curr.substring(0, curr.length() - 1);
        }
        if (close < open) {
            curr = curr + ")";
            generateParentheses(index + 1, n, curr, open, close + 1);
        }
    }
}
