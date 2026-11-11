package CodingShuttle.BitManipluation;

public class ClearTheBitInTheGivenRange {
    public static void main(String[] args) {

        int n = 724;
        int i = 2;
        int j = 6;
        System.out.println(clearTheBitInTheGivenRange(n, i, j));

    }

    public static int clearTheBitInTheGivenRange(int n, int i, int j) {
        int a = -1 << (j + 1);
        int b = (1 << i) - 1;
        int masked = a | b;

        return (n & masked);
    }
}
