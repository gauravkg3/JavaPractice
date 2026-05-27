package CodingShuttle;

public class printAllSubset {
    public static void main(String[] args) {
        String str = "abc";
        printSubset(str);
    }

    public static void printSubset(String s) {
        printSubsetHelper(s, 0, "");
    }

    public static void printSubsetHelper(String s, int i, String curr) {
        if (i == s.length()) {
            System.out.println(curr);
            return;
        }
        printSubsetHelper(s, i + 1, curr + s.charAt(i));
        printSubsetHelper(s, i + 1, curr);
    }
}
