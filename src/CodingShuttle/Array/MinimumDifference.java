package CodingShuttle.Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MinimumDifference {
    public static void main(String[] args) {

        int arr[] = {12, 9, 8, 2, 11};
        Arrays.sort(arr);
        List<List<Integer>> ans = getMinimumSum(arr);

        System.out.println(ans);
    }

    public static List<List<Integer>> getMinimumSum(int arr[]) {
        int minimum = Integer.MAX_VALUE;
        List<List<Integer>> ans = new ArrayList<>();
        for (int i = 1; i < arr.length; i++) {
            int difference = arr[i] - arr[i - 1];
            minimum = Math.min(difference, minimum);
        }

        for (int i = 1; i < arr.length; i++) {
            int difference = arr[i] - arr[i - 1];
            if (difference == minimum) {
                List<Integer> list = new ArrayList<>();
                list.add(arr[i - 1]);
                list.add(arr[i]);

                ans.add(list);
            }

        }

        return ans;
    }


}
