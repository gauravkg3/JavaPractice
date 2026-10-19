package CodingShuttle.Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {
    public static void main(String[] args) {
        int a[] = {-100, -70, -60, 110, 120, 130, 160};

        Arrays.sort(a);
        List<List<Integer>> ans = new ArrayList<>();

        for (int i = 0; i < a.length - 2; i++) {
            if (i > 0 && a[i - 1] == a[i]) {
                continue;
            }
            List<List<Integer>> temp = twoSum(a, -a[i], i);
            for (List<Integer> ele : temp) {
                ele.add(0, a[i]);
                ans.add(ele);
            }
        }

        System.out.println(ans);

    }

    public static List<List<Integer>> twoSum(int arr[], int target, int startForm) {
        int l = startForm;
        int r = arr.length - 1;
        List<List<Integer>> ans = new ArrayList<>();
        while (l < r) {

            if (l > startForm && arr[l] == arr[l - 1]) {
                l++;
                continue;
            }
            if (r < arr.length - 1 && arr[r] == arr[r + 1]) {
                r--;
                continue;
            }

            int sum = arr[l] + arr[r];
            if (sum > target) {
                r--;
            } else if (sum < target) {
                l++;
            } else {
                List<Integer> temp = new ArrayList<>();
                temp.add(arr[l]);
                temp.add(arr[r]);
                ans.add(temp);
                l++;
                r--;
            }
        }
        return ans;
    }
}
