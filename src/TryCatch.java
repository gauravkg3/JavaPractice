

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

        // A a1 = new A();
        A a2 = new B();
        // B a3 = new A();
        //B a4 = new B();


        // System.out.println(a4.tryCatchPractice(3));

    }
}