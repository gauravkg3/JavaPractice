package Doselect;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int input;


        Scanner sc = new Scanner(System.in);


        List<EmployeeDetails> list = new ArrayList<>();
        boolean exits = false;

        while (!exits) {

            System.out.println("Enter 1 to provide Employee Details :");
            System.out.println("Enter 2 to get the top 3 Employee with highest salary :");
            System.out.println("Enter 3 for exits :");

            System.out.println("Enter your choice");
            input = sc.nextInt();


            switch (input) {
                case 1:

                    EmployeeDetails employeeDetails = new EmployeeDetails();

                    System.out.println("Enter Employee Name :");
                    employeeDetails.setName(sc.nextLine());

                    System.out.println("Enter Employee Designation :");
                    employeeDetails.setDesignation(sc.nextLine());

                    System.out.println("Enter Employee Salary :");
                    employeeDetails.setSalary(sc.nextInt());

                    list.add(employeeDetails);

                    break;

                case 2:
                    if (list.isEmpty()) {
                        System.out.println("Empty List : Nothing to Show");
                        break;
                    }


                    System.out.println("Top three Employees with highest salary are :");

                    list.sort(new EmployeeComparator());

                    for (int i = 0; i < Math.min(3, list.size()); i++) {
                        System.out.println(list.get(i));
                    }

                    break;
                case 3:
                    System.out.println("Happy coding");
                    exits = true;

                default:
                    break;
            }

        }

        System.out.println("Thanks for visiting us.");


    }
}
