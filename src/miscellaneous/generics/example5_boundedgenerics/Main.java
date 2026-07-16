package miscellaneous.generics.example5_boundedgenerics;

public class Main {
    public static void main(String[] args) {
        Manager manager=new Manager("Amit", 200000);
        SalaryCalculator<Manager>managersalary=new SalaryCalculator<>(manager);

        Developer developer=new Developer("Akshay", 160000);
        SalaryCalculator<Developer>devsalary=new SalaryCalculator<>(developer);

        managersalary.printSalary();
        devsalary.printSalary();
    }
}
