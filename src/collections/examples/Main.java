package collections.examples;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Customer> list = new ArrayList<>();
        list.add(new Customer("C101","Rahul", 23,"Akshay" ,
                LocalDate.of(2025, 5, 2), LocalDate.of(2025, 8, 15),
                Arrays.asList("PINS","Chatbot","HRMS")));


        list.add(new Customer("C104","Yash", 23,"Akshay" ,
                LocalDate.of(2025, 5, 2), LocalDate.of(2025, 8, 15),
                Arrays.asList("PINS","Chatbot","HRMS")));

        list.add(new Customer("C102", "Sneha", 25, "Manager2",
                LocalDate.of(2022, 5, 15), LocalDate.of(2023, 12, 31),
                Arrays.asList("ProjectX")));

        list.add(new Customer("C103", "Amit", 30, "Manager3",
                LocalDate.of(2024, 2, 1), LocalDate.of(2025, 2, 1),
                Arrays.asList("ProjectM", "ProjectN")));

        String search="Yash";

        boolean exists = false;
        for(Customer c : list){
            if(c.getName()==search){
                exists = true;
            }
        }

        if(exists){
            System.out.println("Customer with this name already exists");
        }else{
            System.out.println("No Customer Found");
        }

        list.stream()
                .filter(c -> c.getName().equalsIgnoreCase(search))
                .findFirst()
                .ifPresent(System.out::println);

    }
}
