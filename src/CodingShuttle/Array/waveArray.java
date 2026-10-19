package CodingShuttle.Array;

import java.util.Arrays;

public class waveArray {
    public static void main(String[] args) {

        int arr[] = {1, 9, 5, 2, 0, 7, 4, 8, 3, 6};
        printWaveArrayNonLexoOrder(arr);

        Arrays.stream(arr).forEach(n -> System.out.print(n + " "));

    }

    public static void printWaveArray(int arr[]) {
        Arrays.sort(arr);
        int n = arr.length;

        for (int i = 1; i < n; i += 2) {
            swapArray(arr, i - 1, i);
        }

    }

    public static void printWaveArrayNonLexoOrder(int arr[]) {

        int n = arr.length;

        for (int i = 1; i < n; i += 2) {
            if (arr[i - 1] < arr[i]) {
                swapArray(arr, i - 1, i);
            }
            if (i < n - 1 && arr[i] > arr[i + 1]) {
                swapArray(arr, i, i + 1);
            }
        }

    }

    public static void swapArray(int arr[], int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
