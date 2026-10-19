package CodingShuttle.Stack;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;

public class MaximumOfMinimumForEveryWindowSize {
    public static void main(String[] args) {
        int arr[] = {1, 4, 3, 2, 7, 9, 6, 4};

        ArrayList<Integer> answer = MaximumOfMinimumForEveryWindowSize.maxOfMins(arr);

        System.out.println(answer);
    }

    public static ArrayList<Integer> maxOfMins(int[] arr) {

        // code here

        int n = arr.length;
        ArrayList<Integer> left = prevSmaller(arr);
        ArrayList<Integer> right = nextSmallerEle(arr);

        ArrayList<Integer> ans = new ArrayList<>(n);

        for (int i = 0; i < n; i++) {
            ans.add(Integer.MIN_VALUE);
        }
        for (int i = 0; i < n; i++) {
            int wl = right.get(i) - left.get(i) - 1;
            ans.set(wl - 1, Math.max(ans.get(wl - 1), arr[i]));
        }
        for (int i = n - 2; i >= 0; i--) {
            ans.set(i, Math.max(ans.get(i), ans.get(i + 1)));
        }
        return ans;

    }

    public static ArrayList<Integer> prevSmaller(int[] arr) {
        // code here
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        ArrayList<Integer> ansList = new ArrayList<>();
        // stack.push(-1);
        for (int i = 0; i < arr.length; i++) {
            while (!stack.isEmpty() && arr[stack.peek()] >= arr[i]) {
                stack.pop();
            }


            if (stack.isEmpty()) {
                ansList.add(-1);
            } else {
                ansList.add(stack.peek());
            }

            stack.push(i);

        }

        return ansList;

    }


    static ArrayList<Integer> nextSmallerEle(int[] arr) {
        // code here
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        ArrayList<Integer> ansList = new ArrayList<>();

        // stack.push(-1);

        for (int i = arr.length - 1; i >= 0; i--) {
            while (!stack.isEmpty() && arr[stack.peek()] >= arr[i]) {
                stack.pop();
            }


            if (stack.isEmpty()) {
                ansList.add(arr.length);
            } else {
                ansList.add(stack.peek());
            }

            stack.push(i);

        }
        Collections.reverse(ansList);
        return ansList;
    }
}
