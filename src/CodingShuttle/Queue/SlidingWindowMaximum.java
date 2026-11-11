package CodingShuttle.Queue;

import java.util.ArrayDeque;

public class SlidingWindowMaximum {
    public static void main(String[] args) {

        int arr[] = {2, 5, 1, 3, 2, 1, 4, 5};
        int k = 4;

        int ans[] = slidingWindowMaximum(arr, k);

        for (int ele : ans) {
            System.out.print(ele + " ");
        }

    }

    public static int[] slidingWindowMaximum(int a[], int k) {
        ArrayDeque<Integer> dq = new ArrayDeque<>();
        int i = 0;
        while (i < k) //handling first windows of K size
        {
            while (!dq.isEmpty() && dq.getLast() < a[i]) {
                dq.pollLast();
            }
            dq.offerLast(a[i]);
            i++;
        }
        int n = a.length;
        int ans[] = new int[n - k + 1];
        for (; i < n; i++) //i is already at its correct position
        {
            ans[i - k] = dq.peekFirst();

            if (a[i - k] == dq.peekFirst()) {
                dq.pollFirst();
            }
            while (!dq.isEmpty() && dq.getLast() < a[i]) {
                dq.pollLast();
            }
            dq.offerLast(a[i]);

        }
        ans[i - k] = dq.peekFirst();


        return ans;
    }
}
