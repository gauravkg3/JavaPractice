package CodingShuttle.Queue;

import java.util.LinkedList;
import java.util.Queue;

public class FirstNonRepeatingCharacterInStream {
    public static void main(String[] args) {

        String str = "abacbdcda";
        System.out.println(firstNonRepeatingCharacter(str));

    }

    public static String firstNonRepeatingCharacter(String str) {
        Queue<Character> queue = new LinkedList<>();
        StringBuilder sbuilder = new StringBuilder();
        int frequency[] = new int[26];

        for (char c : str.toCharArray()) {
            queue.offer(c);
            frequency[c - 'a']++;

            while (!queue.isEmpty() && frequency[queue.peek() - 'a'] > 1) {
                queue.poll();
            }

            if (queue.isEmpty()) {
                sbuilder.append("#");
            } else {
                sbuilder.append(queue.peek());
            }
        }

        return sbuilder.toString();
    }
}
