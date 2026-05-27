package InterviewQuestion;

class A {
    public void getName() {
        System.out.println("A");
    }
}

class B extends A {
    public void getName() {
        System.out.println("B");
    }
}

public class ParentChild {
    public static void main(String[] args) {
        //  A a1 = new A();
        A a2 = new B();
        // B b1 = new A();
        B b2 = new B();

        //a1.getName();
        //a2.getName();
        //b1.getName();
        b2.getName();


    }
}
