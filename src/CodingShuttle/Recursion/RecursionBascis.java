package CodingShuttle.Recursion;

public class RecursionBascis {
    public static void main(String[] args) {
        // foo(3);

        System.out.println(sumOfNatural(4)
        );

    }

    public static void foo(int n) {
        if (n > 0) {
            System.out.println(n);

            foo(n - 1);
            foo(n - 1);
        }
    }

    public static int sumOfNatural(int n) {
        if (n == 1) {
            return 1;
        } else {
            return sumOfNatural(n - 1) + n;
        }
    }
}
