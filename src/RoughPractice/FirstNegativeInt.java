package RoughPractice;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;

public class FirstNegativeInt {

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

            if (!dq.isEmpty() && nums[i - k] == dq.peekFirst()) {
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