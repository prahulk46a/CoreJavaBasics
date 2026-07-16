package miscellaneous.generics.example4_wildcards.unbounded_wildcard;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Employee> employees = Arrays.asList(
                new Employee("Rahul"),
                new Employee("Amit")
        );

        List<Customer> customers = Arrays.asList(
                new Customer("John"),
                new Customer("David")
        );

        Report report = new Report();

        report.print(employees);
        report.print(customers);
    }
}
