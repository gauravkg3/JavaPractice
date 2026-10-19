package CodingShuttle.Recursion;

import java.util.List;

public class printAllSubset {
    public static void main(String[] args) {
        String str = "abc";
        printSubset(str);
    }

//    public static void printSubset(String s) {
//        printSubsetHelper(s, 0, "");
//    }
//
//    public static void printSubsetHelper(String s, int i, String curr) {
//        if (i == s.length()) {
//            System.out.println(curr);
//            return;
//        }
//        printSubsetHelper(s, i + 1, curr + s.charAt(i));
//        printSubsetHelper(s, i + 1, curr);
//    }

    public static void printSubset(String str) {
        printSubsetHelper(str, 0, "");
    }

    public static void printSubsetHelper(String str, int i, String curr) {
        if (i == str.length()) {
            System.out.println(curr);
            return;
        }
        printSubsetHelper(str, i + 1, curr + str.charAt(i));
        printSubsetHelper(str, i + 1, curr);
    }
}
