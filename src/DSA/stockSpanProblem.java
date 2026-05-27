package DSA;

import java.util.ArrayList;
import java.util.Stack;

public class stockSpanProblem {
    public static void main(String[] args) {

        ArrayList<Integer> list=new ArrayList<>();
        int a[]={3,7,7,6,1,2,6,3,7,5};

        int b[]={100,80,60,70,60,75,85};

        list=calculateSpan(a);
        System.out.println(list);

    }


        public static ArrayList<Integer> calculateSpan(int[] arr) {
            // code here
            Stack<Integer> st=new Stack<>();
            st.push(0);
            int size=arr.length;

            ArrayList<Integer> list=new ArrayList<>();
            list.add(1);

            for(int i=1;i<size;i++)
            {
                while(!st.isEmpty()  && arr[st.peek()]<=arr[i])
                {
                    st.pop();
                }
                if(st.isEmpty())
                {
                    list.add(i+1);
                    st.push(i);
                }else {
                    list.add(i - st.peek());
                    st.push(i);
                }
            }

          return list;
        }

}
