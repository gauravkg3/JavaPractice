package CodingShuttle.Array;

import java.lang.reflect.Array;
import java.util.Arrays;

public class LeftRotationOfArray {
    public static void main(String[] args) {
        int a[] = {1, 4, 5, 6};
        int b[] = {20, 3};

        int ans[][] = multipleRotation(a, b);

        for (int eachArray[] : ans) {

            printArray(eachArray);
        }


        int k = 2;

//        while (k > 0) {
//            leftRotationByOnePlace(arr, 4);
//            k--;
//        }
//        Arrays.stream(arr).forEach(ele -> System.out.print(ele + " "));
    }

    public static int[][] multipleRotation(int a[], int b[]) {
        int n = a.length;
        int temp[] = new int[2 * n];

        int ans[][] = new int[b.length][a.length];

        for (int i = 0; i < n; i++) {
            temp[i] = a[i];
            temp[i + n] = a[i];
        }

        // printArray(temp);
        for (int j = 0; j < b.length; j++) {
            int offSet = b[j] % (a.length);

            for (int k = 0; k < a.length; k++) {
                ans[j][k] = temp[k + offSet];
            }
        }

        return ans;
    }

    public static void printArray(int arr[]) {
        for (int ele : arr) {
            System.out.print(ele + " ");
        }

        System.out.println();
    }

    public static void leftRotationByOnePlace(int arr[], int n) {
        int a = arr[0];

        for (int i = 0; i < n - 1; i++) {
            arr[i] = arr[i + 1];
        }
        arr[n - 1] = a;
    }
}
