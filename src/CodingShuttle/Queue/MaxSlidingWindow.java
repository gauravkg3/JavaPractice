package CodingShuttle.Queue;

import java.util.Arrays;

public class MaxSlidingWindow {
    public static void main(String[] args) {
        int nums[] = {1, 3, -1, -3, 5, 3, 6, 7};
        int k = 3;
        int ans[] = maxSlidingWindow(nums, 3);

        for (int ele : ans) {
            System.out.print(ele + " ");
        }

    }

    public static int[] maxSlidingWindow(int[] nums, int k) {


        int ans[] = new int[nums.length - k + 1];


        int p = 0;

        for (int i = 0; i < nums.length - k + 1; i++) {
            int maxi = Integer.MIN_VALUE;
            for (int j = i; j < i + k; j++) {
                maxi = Math.max(maxi, nums[j]);

            }
            ans[p] = maxi;
            p++;
        }

        return ans;

    }
}
