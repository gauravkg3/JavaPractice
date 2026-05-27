package DSA;

import java.util.ArrayList;
import java.util.Stack;

public class nextGreatorElement {

    public static  ArrayList<Integer> nextLargerElement(int[] arr) {
        // code here
        Stack<Integer> st=new Stack<>();
        ArrayList<Integer> list=new ArrayList<>();
        int size=arr.length;
        st.push(arr[size-1]);
        for(int i=0;i<size;i++)
        {
            list.add(-1);
        }
        for(int i=size-1;i>=0;i--)
        {
            while(!st.isEmpty()  && st.peek()<=arr[i])
            {
                st.pop();
            }

            if(st.empty())
            {
                list.set(i,-1);
                st.push(arr[i]);
            }else {
                list.set(i, st.peek());
                st.push(arr[i]);
            }
        }
        return list;
    }

    public static  ArrayList<Integer> nextLargestElement2(int arr[])
    {
        Stack<Integer> st=new Stack<>();
        st.push(0);
        ArrayList<Integer>  ans=new ArrayList<>();

        int size=arr.length;
        for(int i=0;i<size;i++)
        {
            ans.add(-1);
        }

        for(int i=1;i<size;i++)
        {
            while(!st.isEmpty() && arr[st.peek()]<=arr[i])
            {
                ans.set(st.peek(),arr[i]);
                st.pop();

            }
            st.push(i);
        }

        return  ans;
    }

    static ArrayList<Integer> nextSmallerEle(int[] arr) {
        // code here
        Stack<Integer> st=new Stack<>();

        ArrayList<Integer>  ans=new ArrayList<>();

        int size=arr.length;
        st.push(size-1);
        for(int i=0;i<size;i++)
        {
            ans.add(-1);
        }

        for(int i=0;i<size;i++)
        {
            while(!st.isEmpty() && arr[st.peek()]>=arr[i])
            {
                ans.set(st.peek(),arr[i]);
                st.pop();

            }
            st.push(i);
        }

        return  ans;

    }

    public static void main(String[] args) {

        int[] arr ={4,2,1,5,3};
        System.out.println(nextSmallerEle(arr));
    }
}
