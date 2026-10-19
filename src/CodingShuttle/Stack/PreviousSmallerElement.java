package CodingShuttle.Stack;

import java.util.ArrayDeque;
import java.util.ArrayList;

public class PreviousSmallerElement {
    public static void main(String[] args) {
        int arr[] = {1, 4, 3, 2, 7, 9, 6, 4};

        ArrayList<Integer> ans = Solution.prevSmaller(arr);

        System.out.println(ans);
    }
}

class Solution {
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
                // ansList.add(arr[stack.peek()]); //pushing directly element as per gfg question
                ansList.add(stack.peek());
            }

            stack.push(i);

        }

        return ansList;

    }
}