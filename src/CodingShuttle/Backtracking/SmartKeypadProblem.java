package CodingShuttle.Backtracking;

import java.util.ArrayList;

public class SmartKeypadProblem {

    public static void main(String[] args) {
        String str = "56";
        ArrayList<String> list = new ArrayList<>();
        list = smartKeypadProblem(str);

        System.out.println(list);
    }


    public static ArrayList<String> smartKeypadProblem(String str) {
        String keypadWords[] = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        ArrayList<String> ans = new ArrayList<>();

        smartKeypadProblemHelper(str, keypadWords, 0, "", ans);
        return ans;

    }

    public static void smartKeypadProblemHelper(String input, String[] keypadWords, int index, String curr, ArrayList<String> ans) {
        if (index == input.length()) {
            ans.add(curr);
            return;
        }
        int number = input.charAt(index) - '0'; //number=5 input=56
        String keypadString = keypadWords[number]; //jkl
        for (int i = 0; i < keypadString.length(); i++) {
            // smartKeypadProblemHelper(input, keypadWords, index + 1, curr + keypadString.charAt(i), ans);

            curr = curr + keypadString.charAt(i);
            smartKeypadProblemHelper(input, keypadWords, index + 1, curr, ans);
            curr = curr.substring(0, curr.length() - 1);
        }
    }
}
