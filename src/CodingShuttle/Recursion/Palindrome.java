package CodingShuttle.Recursion;

public class Palindrome {
    public static void main(String[] args) {


        String s = "racecars";

        System.out.println(isPalindrome(s));
    }

    public static boolean isPalindrome(String s) {
        // code here

        int l = 0;
        int r = s.length() - 1;

        while (l <= r) {
            boolean ans = isPalindromeHelper(s, l, r);
            if (ans == false) return false;
            l++;
            r--;
        }
        return true;
    }

    public static boolean isPalindromeHelper(String s, int l, int r) {
        // code here

        if (s.charAt(l) == s.charAt(r)) return true;
        else
            return false;

    }
}
