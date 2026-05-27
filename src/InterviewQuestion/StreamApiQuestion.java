package InterviewQuestion;

import java.util.*;
import java.util.stream.Collectors;

public class StreamApiQuestion {
    public static void main(String[] args) {
        List<Integer> list = List.of(1, 99, 85, 77, 85, 169, 23);
        //1) Second-highest Element
        System.out.println(list.stream().distinct().sorted(Comparator.reverseOrder()).skip(1).findFirst().orElse(null));

        List<String> stringList = Arrays.asList("java", "api", "count", "count", "map", "api", "java", "springboot");
        HashSet<String> set = new HashSet<>();

        //2)max length element
        System.out.println(stringList.stream().max(Comparator.comparing(n -> n.length())).orElse(null));
        System.out.println(stringList.stream().reduce((a, b) -> a.length() > b.length() ? a : b).orElse(null));

        //3)sort list based on length
        System.out.println(stringList.stream().sorted(Comparator.comparing(n -> n.length())).collect(Collectors.toList()));
        System.out.println(stringList.stream().sorted((a, b) -> -a.length() + b.length()).collect(Collectors.toList()));

        //4)duplicate element in list
        System.out.println(stringList.stream().filter(n -> !set.add(n)).collect(Collectors.toList()));

        String str = "Success";

        System.out.println(str.chars().mapToObj(c -> (char) c).collect(Collectors.groupingBy(c -> c, Collectors.counting())));

        //5)maximum occurrence of a character
        System.out.println(str.chars().mapToObj(c -> (char) c).collect(Collectors.groupingBy(c -> c, Collectors.counting()))
                .entrySet().stream().max(Map.Entry.comparingByValue()).get().getKey());

        Map.Entry<Character, Long> map = str.chars().mapToObj(c -> (char) c).
                collect(Collectors.groupingBy(c -> c, Collectors.counting()))
                .entrySet().stream().max(Map.Entry.comparingByValue()).orElse(null);

        System.out.println(map.getKey() + " : " + map.getValue());


    }
}
