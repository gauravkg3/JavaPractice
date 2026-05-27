package InterviewQuestion;

import java.util.ArrayList;
import java.util.List;


class SubClass extends GenericClass<Integer> {
}

class AnotherSubClass<T> extends GenericClass<Integer> {
}

public class GenericClass<T extends Number> {
    T name;

    public T getName() {
        return name;
    }

    public void setName(T name) {
        this.name = name;
    }

    public static void main(String[] args) {
        SubClass sub = new SubClass();
        sub.setName(404);
        System.out.println(sub.getName());

        Print print = new Print();
        List<Integer> sourceListWildCard = new ArrayList<>();
        List<Float> destinationListWildCard = new ArrayList<>();

        print.compute(sourceListWildCard, destinationListWildCard);
        //print.compute1(sourceListWildCard, destinationListWildCard);
        print.compute(sourceListWildCard, destinationListWildCard);

    }
}

class Print {
    public void compute(List<? extends Number> source, List<? extends Number> destination) {

    }

    public <T extends Number> void compute1(List<T> source, List<T> destination) {

    }

    public <T extends Number> void compute2(List<T> source, List<? extends Number> destination) {

    }
}




