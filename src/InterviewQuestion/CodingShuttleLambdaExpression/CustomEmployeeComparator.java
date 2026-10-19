package InterviewQuestion.CodingShuttleLambdaExpression;

import java.util.Comparator;

public class CustomEmployeeComparator implements Comparator<EmployeeComparable> {

    public int compare(EmployeeComparable e1, EmployeeComparable e2) {
        return e1.firstName.compareTo(e2.firstName);
    }
}
