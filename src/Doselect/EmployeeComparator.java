package Doselect;

import java.util.Comparator;

public class EmployeeComparator implements Comparator<EmployeeDetails> {


    @Override
    public int compare(EmployeeDetails o1, EmployeeDetails o2) {
        return o2.getSalary().compareTo(o1.getSalary());
    }
}
