package InterviewQuestion;

import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.stream.Collectors;

public class CompletableFutures {
    public static void main(String[] args) throws ExecutionException, InterruptedException {

        List<Integer> list = List.of(1, 2, 5, 6, 9, 8, 7, 12, 19);


        CompletableFuture<List<Integer>> evenList = CompletableFuture.
                supplyAsync(() -> list.stream().filter(n -> n % 2 == 0).collect(Collectors.toList()));

        CompletableFuture<Void> oddList = CompletableFuture.runAsync(() -> list.stream().
                filter(n -> n % 2 != 0).forEach(n -> System.out.print(n + " ")));


        System.out.println(evenList.join());

        // CompletableFuture.allOf(evenList,oddList).join();

        CompletableFuture.runAsync(() -> list.stream().filter(n -> n % 2 == 0).forEach(n -> System.out.print(n)));

    }
}
