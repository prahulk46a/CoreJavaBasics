package miscellaneous.generics.example5_boundedgenerics;

public class SalaryCalculator <T extends Employee> {
    private T employee;

    public SalaryCalculator(T employee) {
        this.employee = employee;
    }

    public void printSalary() {
        System.out.println(
                employee.getName() +
                        " Salary : ₹" +
                        employee.getSalary()
        );
    }
}
