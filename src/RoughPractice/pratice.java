package RoughPractice;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;

public class pratice {
    public static void main(String[] args) {
        int arr[] = {-8, 2, -9, -6, 10};
        int k = 2;

        List<Integer> ans = Solution.firstNegInt(arr, 2);

        System.out.println(ans);
    }
}

class Solution {
    static List<Integer> firstNegInt(int nums[], int k) {
        // code here


        int n = nums.length;

        ArrayDeque<Integer> dq = new ArrayDeque<>();
        List<Integer> ans = new ArrayList<>();

        int i = 0;

        while (i < k) {
            if (nums[i] < 0) {
                dq.offerLast(nums[i]);
            }
            i++;
        }

        for (; i < n; i++) {
            if (dq.isEmpty()) {
                ans.add(0);
            } else {
                ans.add(dq.peekFirst());
            }

            while (!dq.isEmpty() && ans.get(i - k) == dq.peekFirst()) {
                dq.removeFirst();
            }
            if (nums[i] < 0) {
                dq.offerLast(nums[i]);
            }
        }

        if (dq.isEmpty()) {
            ans.add(0);
        } else {
            ans.add(dq.peekFirst());
        }

        return ans;
    }
}