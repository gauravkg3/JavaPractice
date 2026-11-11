package CodingShuttle.BitManipluation;

import java.util.jar.JarOutputStream;

public class BitQuestion {

    public static void main(String[] args) {
        int n = 13;
        int k = 2;

//        System.out.println(getIthBitOfANumber(n, k));
//        System.out.println(setTheIthBit(n, k));
        System.out.println(clearTheIthBit(n, k));
        System.out.println(~0);
    }

    public static int getIthBitOfANumber(int n, int i) {
        int masked = 1 << i;
        if ((n & masked) == 0) return 0;
        else return 1;
    }

    public static int setTheIthBit(int n, int i) {
        int masked = 1 << i;
        return (n | masked);
    }

    public static int clearTheIthBit(int n, int i) {
        int masked = ~(1 << i);
        return (n & masked);
    }
}
