package CodingShuttle.Array;

import java.util.Arrays;

public class MakeMatrixEqual {
    public static void main(String[] args) {
        int a[][] = {{291}};
        int k = 87;

//        int a[][] = {{2, 4},
//                {22, 24}};


        int ans = makeMatrixEqual(a, k);
        System.out.println(ans);
    }

    public static int makeMatrixEqual(int arr[][], int k) {

        int m = arr.length;
        int n = arr[0].length;
        int flatArray[] = new int[m * n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                flatArray[i * n + j] = arr[i][j];
            }
        }


        Arrays.sort(flatArray);
        return makeMatrixEqualHelper(flatArray, k);
    }

    public static int makeMatrixEqualHelper(int arr[], int k) {
        int n = arr.length;
        int median = arr[n / 2];
        int count = 0;

        for (int i = 0; i < n; i++) {
            if ((arr[i] - median) % k != 0) return -1;
        }

        for (int i = 0; i < n; i++) {
            count += Math.abs(arr[i] - median) / k;
        }
        return count;
    }
}
