package RoughPractice;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        int arr[] = {-8, 2, -9, -6, 10};
        int k = 2;
        List<Integer> list = FirstNegativeInt.firstNegInt(arr, k);
        System.out.println(list);
    }

}