package CodingShuttle.Recursion;

public class countOccurencesOfaString {
    public static void main(String[] args) {
        String text = "hello world, hello universe";
        String word = "hello";

        System.out.println(count(text, word));
    }

    public static int count(String text, String word) {
        //You can code here

        return countHelper(text, word, 0);


    }

    public static int countHelper(String text, String word, int i) {
        if (i + word.length() > text.length()) return 0;

        int subProblemKaAns = countHelper(text, word, i + 1);

        if (text.substring(i, i + word.length()).equals(word)) {
            return subProblemKaAns + 1;

        } else {
            return subProblemKaAns;

        }

    }
}
