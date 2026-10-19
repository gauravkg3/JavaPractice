package InterviewQuestion.CodingShuttleLambdaExpression;
//
//class A {
//    public void printWords(String s) {
//        System.out.println("Words :" + s);
//    }
//
//    public void printWords(Integer s) {
//        System.out.println("Words from Integer :" + s);
//    }
//
//}

abstract class Animal {

    // Instance variable
    String name;

    Animal(String name) {
        this.name = name;
    }

    void display() {
        System.out.println("Name: " + name);
    }

    abstract void sound();
}

class Dog extends Animal {

    Dog(String name) {
        super(name);
    }

    @Override
    void sound() {
        System.out.println("Bark");
    }
}


public class PracticeClass {
    public static void main(String[] args) {
//        A a = new A();
//        a.printWords(null);

        Dog dog = new Dog("Tommy");
        dog.display();
        dog.sound();
    }
}
