package DSA;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

public class stockSpanProblem {
    public static void main(String[] args) {

        ArrayList<Integer> list=new ArrayList<>();
        int a[]={3,7,7,6,1,2,6,3,7,5};

        int b[]={100,80,60,70,60,75,85};

        list=calculateSpan(a);
        System.out.println(list);



    }


    public static void permuteHelper(int arr[], int l, int r) {

        if (l == r) {
            printArray(arr);
            return;
        }

        for (int i = l; i < arr.length; i++) {
            swap(arr, i, l);
            permuteHelper(arr, l + 1, r);
            swap(arr, i, l);
        }

    }

    public static void swap(int a[], int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    public static void printArray(int a[]) {
        Arrays.stream(a).forEach(System.out::print);
        System.out.println();
    }


    public static ArrayList<Integer> calculateSpan(int[] arr) {
        // code here
        Stack<Integer> st = new Stack<>();
        st.push(0);
        int size = arr.length;

        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);

        for (int i = 1; i < size; i++) {
            while (!st.isEmpty() && arr[st.peek()] <= arr[i]) {
                st.pop();
            }
            if (st.isEmpty()) {
                list.add(i + 1);
                st.push(i);
            } else {
                list.add(i - st.peek());
                st.push(i);
            }
        }

        return list;
    }

}
