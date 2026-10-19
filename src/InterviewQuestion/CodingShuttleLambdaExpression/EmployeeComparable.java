package InterviewQuestion.CodingShuttleLambdaExpression;

public class EmployeeComparable implements Comparable<EmployeeComparable> {

    public int a;
    public String firstName;
    public String lastName;

    public EmployeeComparable(int a, String firstName, String lastName) {
        this.a = a;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public int compareTo(EmployeeComparable other) {
        return Integer.compare(this.a, other.a);
    }
}
