package CodingShuttle.Stack;

import java.util.ArrayDeque;
import java.util.Arrays;

public class StockSpan {
    public static void main(String[] args) {

        int price[] = {100, 80, 60, 170, 60, 75, 85};
        int ans[] = stockSpanHelper(price);

        Arrays.stream(ans).forEach(n -> System.out.print(n + ","));

    }

    public static int[] stockSpanHelper(int a[]) {
        int n = a.length;
        int s[] = new int[n];
        s[0] = 1;   //first value of array will be always 1

        ArrayDeque<Integer> stack = new ArrayDeque<>();
        stack.push(0);  //here we are keeping  the indexes,not the actual data

        for (int i = 1; i < n; i++) {

            while (!stack.isEmpty()) {
                int top = stack.peek();

                if (a[top] > a[i]) {
                    break;
                } else {
                    stack.pop();
                }
            }

            if (stack.isEmpty()) {
                s[i] = i + 1;
                stack.push(i);
            } else {
                s[i] = i - stack.peek();
                stack.push(i);
            }

        }

        return s;
    }
}
