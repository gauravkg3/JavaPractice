package CodingShuttle.Array;

public class MaximumAbsoluteDifference {

    public static void main(String[] args) {
        int arr[] = {12, 9, 8, 2, 11};

        int ans = getMaximumAbsoluteDifference(arr);
        System.out.println(ans);

    }

    public static int getMaximumAbsoluteDifference(int arr[]) {
        int n = arr.length;
        int aipiMax = Integer.MIN_VALUE;
        int aipiMin = Integer.MAX_VALUE;
        int aimiMax = Integer.MIN_VALUE;
        int aimiMin = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            aipiMax = Math.max(arr[i] + i, aipiMax);
            aipiMin = Math.min(arr[i] + i, aipiMin);
            aimiMax = Math.max(arr[i] - i, aimiMax);
            aimiMin = Math.min(arr[i] - i, aimiMin);
        }
        int diffaipiMax = aipiMax - aipiMin;
        int diffaimiMax = aimiMax - aimiMin;

        return Math.max(diffaipiMax, diffaimiMax);
    }
}
