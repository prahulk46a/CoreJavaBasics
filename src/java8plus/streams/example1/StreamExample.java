package java8plus.streams.example1;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamExample {

    public static List<Employee> getEmployees() {
        return Arrays.asList(
                new Employee(1, "Rahul", 25, "Male", "IT", 2022, 65000),
                new Employee(2, "Priya", 28, "Female", "HR", 2021, 55000),
                new Employee(3, "Amit", 30, "Male", "Finance", 2019, 75000),
                new Employee(4, "Sneha", 26, "Female", "IT", 2023, 62000),
                new Employee(5, "Vikram", 35, "Male", "Sales", 2018, 85000),
                new Employee(6, "Neha", 29, "Female", "Marketing", 2020, 68000),
                new Employee(7, "Arjun", 32, "Male", "IT", 2017, 98000),
                new Employee(8, "Pooja", 27, "Female", "Finance", 2022, 70000),
                new Employee(9, "Rohit", 31, "Male", "Operations", 2019, 72000),
                new Employee(10, "Kavya", 24, "Female", "HR", 2024, 50000),
                new Employee(11, "Suresh", 38, "Male", "Management", 2015, 120000),
                new Employee(12, "Anjali", 29, "Female", "Sales", 2021, 65000),
                new Employee(13, "Deepak", 40, "Male", "Operations", 2013, 110000),
                new Employee(14, "Meera", 33, "Female", "Marketing", 2018, 80000),
                new Employee(15, "Karan", 27, "Male", "IT", 2023, 60000),
                new Employee(16, "Nisha", 36, "Female", "Finance", 2016, 95000),
                new Employee(17, "Aditya", 26, "Male", "Sales", 2022, 58000),
                new Employee(18, "Ritika", 31, "Female", "IT", 2020, 88000),
                new Employee(19, "Manoj", 42, "Male", "Management", 2012, 140000),
                new Employee(20, "Shreya", 25, "Female", "HR", 2024, 52000)
        );
    }
    public static void main(String[] args) {
        List<Employee> employees = getEmployees();
        Map<String, Long> employeeCountByDepartment =
                employees.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()));
        System.out.println(employeeCountByDepartment);
    }

}
