package InterviewQuestion.CodingShuttleLambdaExpression;

import java.io.Serializable;

public class Main {
    public static void main(String[] args) {

        // System.out.println(Student.getAge());

        Student s = null;
        System.out.println(s.getAge());


    }
}

class Student implements Serializable {
    String name;
    static int age = 13;

    public static int getAge() {
        return age;
    }
}
