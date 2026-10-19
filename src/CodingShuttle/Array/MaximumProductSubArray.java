package CodingShuttle.Array;

public class MaximumProductSubArray {
    public static void main(String[] args) {

        int arr[] = {-2, 0, -1};
        System.out.println(maximumProductSubArray(arr));

    }

    public static int maximumProductSubArray(int arr[]) {
        int pre = 1;
        int suf = 1;
        int maxProduct = Integer.MIN_VALUE;
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            if (pre == 0) pre = 1;
            if (suf == 0) suf = 1;

            pre *= arr[i];
            suf *= arr[n - i - 1];

            maxProduct = Math.max(maxProduct, Math.max(pre, suf));

        }
        return maxProduct;
    }
}
