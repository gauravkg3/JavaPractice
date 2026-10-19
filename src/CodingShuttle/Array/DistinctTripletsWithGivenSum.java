package CodingShuttle.Array;

import java.util.ArrayList;
import java.util.Arrays;

public class DistinctTripletsWithGivenSum {

    public ArrayList<ArrayList<Integer>> threeSum(int[] arr, int target) {
        // code here
        int n = arr.length;
        Arrays.sort(arr);

        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            if (i > 0 && arr[i] == arr[i - 1]) continue;
            int l = i + 1;
            int r = n - 1;

            while (l < r) {
                int sum = arr[i] + arr[l] + arr[r];
                if (sum > target) r--;
                else if (sum < target) l++;
                else {
                    ArrayList<Integer> list = new ArrayList<>();
                    list.add(arr[i]);
                    list.add(arr[l]);
                    list.add(arr[r]);

                    l++;
                    r--;

                    while (l < r && arr[l - 1] == arr[l]) {
                        l++;
                        continue;
                    }
                    while (l < r && arr[r] == arr[r + 1]) {
                        r--;
                        continue;
                    }
                    ans.add(list);
                }
            }

        }

        return ans;
    }
}
