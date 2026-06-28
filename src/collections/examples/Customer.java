package collections.examples;

import java.time.LocalDate;
import java.util.List;

public class Customer {
    private String custId;
    private String name;
    private int age;
    private String accountManager;
    private LocalDate startDate;
    private LocalDate endDate;
    private List<String> projects;

    public Customer(String custId, String name, int age, String accountManager, LocalDate startDate, LocalDate endDate, List<String> projects) {
        this.custId = custId;
        this.name = name;
        this.age = age;
        this.accountManager = accountManager;
        this.startDate = startDate;
        this.endDate = endDate;
        this.projects = projects;
    }

    public String getCustId() {return custId;}
    public String getName() {return name;}
    public int getAge() {return age;}
    public String getAccountManager() {return accountManager;}
    public LocalDate getStartDate() {return startDate;}
    public LocalDate getEndDate() {return endDate;}
    public List<String> getProjects() {return projects;}

    public void setCustId(String custId) {this.custId = custId;}
    public void setName(String name) {this.name = name;}
    public void setAge(int age) {this.age = age;}
    public void setAccountManager(String accountManager) {this.accountManager = accountManager;}
    public void setStartDate(LocalDate startDate) {this.startDate = startDate;}
    public void setEndDate(LocalDate endDate) {this.endDate = endDate;}
    public void setProjects(List<String> projects) {this.projects = projects;}


    @Override
    public String toString() {
        return "Customer{" +
                "custId='" + custId + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", accountManager='" + accountManager + '\'' +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                ", projects=" + projects +
                '}';
    }


}
