package RoughPractice;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        int arr[][] = {{291}};
        int x = 87;


        int ans = SolutionXX.minOperations(arr, x);
        System.out.println(ans);
    }


    class SolutionXX {

        public static int minOperations(int[][] grid, int x) {

            int a = grid.length;
            int b = grid[0].length;

            int flatArray[] = new int[a * b];

            for (int i = 0; i < a; i++) {
                for (int j = 0; j < b; j++) {
                    flatArray[b * i + j] = grid[i][j];
                }
            }

            Arrays.stream(flatArray).forEach(n -> System.out.print(n + " "));
            System.out.println();

            Arrays.sort(flatArray);
            int arraySize = flatArray.length;

            int median = arraySize / 2;
            int counter = 0;

            System.out.println(median);

            for (int i = 0; i < arraySize; i++) {
                if ((flatArray[i] - flatArray[median]) % x != 0) return -1;
            }

            for (int i = 0; i < arraySize; i++) {
                counter += Math.abs((flatArray[median] - x)) / x;
            }
            return counter;
        }

    }
}
