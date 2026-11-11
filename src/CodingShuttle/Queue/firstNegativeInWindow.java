package CodingShuttle.Queue;

import java.util.ArrayDeque;

public class firstNegativeInWindow {
    public static void main(String[] args) {
        int n[] = {-8, 2, -9, -6, 10};
        int ans[] = firstNegativeInWindow(n, 2);
        for (int ele : ans) {
            System.out.print(ele + " ");
        }
    }

    public static int[] firstNegativeInWindow(int a[], int k) {
        ArrayDeque<Integer> dq = new ArrayDeque<>();
        int i = 0;
        while (i < k) {
            if (a[i] < 0) {
                dq.offerLast(a[i]);
            }
            i++;
        }
        int n = a.length;
        int ans[] = new int[n - k + 1];
        for (; i < n; i++) {
            if (dq.isEmpty()) {
                ans[i - k] = 0;
            } else {
                ans[i - k] = dq.peekFirst();
            }

            if (!dq.isEmpty() && dq.peekFirst() == a[i - k]) {
                dq.pollFirst();
            }
            if (a[i] < 0) {
                dq.offerLast(a[i]);
            }
        }
        if (dq.isEmpty()) {
            ans[n - k] = 0;
        } else {
            ans[n - k] = dq.peekFirst();
        }
        return ans;
    }
}
