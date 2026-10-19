package CodingShuttle.Array;

public class MinimumSumSubArray {
    public static void main(String[] args) {
        int arr[] = {2, 3, 1, 2, 4, 3};
        int target = 7;
        System.out.println(minimumSumSubArray(arr, target));
    }

    public static int minimumSumSubArray(int a[], int target) {
        int l = 0;
        int r = 0;
        int n = a.length;
        int currSum = 0;
        int minLength = Integer.MAX_VALUE;

        while (r < n) {
            currSum += a[r];

            while (currSum >= target) {
                minLength = Math.min(minLength, r - l + 1);
                currSum -= a[l];
                l++;
            }
            r++;
        }
        if (minLength == Integer.MAX_VALUE) {
            minLength = 0;
        }
        return minLength;
    }
}
