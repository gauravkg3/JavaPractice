import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Collectors;

abstract class A {
    int A() {

        System.out.println("A");
        return 1;
    }
}

class B extends A {
    String B() {
        System.out.println("B");

        return "a";
    }


    public int tryCatchPractice(int x) {

        try {

            int y = 10 / x;
            return 3;
        } catch (Throwable t) {
            return 6;
        } finally {
            return 7;
        }

    }


}

public class TryCatch {
    public static void main(String[] args) {

//        // A a1 = new A();
//        A a2 = new B();
//        // B a3 = new A();
//        //B a4 = new B();
//
//
//        // System.out.println(a4.tryCatchPractice(3));
        List<Integer> list = List.of(1, 2, 3, 4, 5, 6);

        CompletableFuture<List<Integer>> even = CompletableFuture.
                supplyAsync(() -> list.stream().filter(n -> n % 2 == 0).collect(Collectors.toList()));

        CompletableFuture<Void> odd = CompletableFuture.runAsync(() -> list.stream().filter(n -> n % 2 != 0).
                forEach(n -> System.out.println(n)));
        System.out.println(even.join());
        System.out.println(odd.join());

    }
}