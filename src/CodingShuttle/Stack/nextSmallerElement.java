package CodingShuttle.Stack;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;

public class nextSmallerElement {
    public static void main(String[] args) {
        int arr[] = {1, 4, 3, 2, 7, 9, 6, 4};

        ArrayList<Integer> ans = Solutions.nextSmallerEle(arr);

        System.out.println(ans);
    }
}

class Solutions {
    static ArrayList<Integer> nextSmallerEle(int[] arr) {
        // code here
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        ArrayList<Integer> ansList = new ArrayList<>();

        // stack.push(-1);

        for (int i = 0; i < arr.length; i++) {
            ansList.add(-1);
        }

        for (int i = arr.length - 1; i >= 0; i--) {
            while (!stack.isEmpty() && arr[stack.peek()] >= arr[i]) {
                stack.pop();
            }
            if (stack.isEmpty()) {
                ansList.set(i, arr.length);
                //ansList.add(-1); for GFG
            } else {
                //ansList.add(arr[stack.peek()]);
                ansList.set(i, stack.peek());
            }
            stack.push(i);
        }
        // Collections.reverse(ansList);
        return ansList;
    }
}