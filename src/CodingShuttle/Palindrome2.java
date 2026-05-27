package CodingShuttle;

public class Palindrome2 {
    public static void main(String[] args) {
        String s = "racecars";

        System.out.println(isPalindrome(s));
    }

    public static boolean isPalindrome(String s) {
        int l = 0;
        int r = s.length() - 1;
        boolean ans = isPalindromeHelper(s, l, r);

        return ans;
    }

    public static boolean isPalindromeHelper(String s, int l, int r) {
        if (l >= r) return true;
        if (s.charAt(l) == s.charAt(r)) {
            return isPalindromeHelper(s, l + 1, r - 1);
        } else {
            return false;
        }


    }
}
