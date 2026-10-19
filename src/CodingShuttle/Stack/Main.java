package CodingShuttle.Stack;

import java.util.ArrayDeque;

public class Main {

    public static void main(String[] args) {
        //StackUsingArray stack = new StackUsingArray(14);
        StackUsingLinkendList stack = new StackUsingLinkendList();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);


//        stack.printStack();
//        stack.push(5);
//        stack.printStack();

        while (!stack.isEmpty()) {
            System.out.print(stack.pop() + " ");
        }
        System.out.println();
        stack.peek();
        stack.push(56);
        System.out.println(stack.peek());
        System.out.println(stack.pop());
        stack.peek();
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());


        ArrayDeque<Integer> stackAD = new ArrayDeque<>();
        stackAD.push(4);
        stackAD.push(2);

        System.out.println(stackAD.pop());
        System.out.println(stackAD.pop());
    }


}
