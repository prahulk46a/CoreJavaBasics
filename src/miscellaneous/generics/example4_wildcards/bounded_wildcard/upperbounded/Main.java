package miscellaneous.generics.example4_wildcards.bounded_wildcard.upperbounded;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        List<Integer> savings =
                Arrays.asList(1000, 2000, 3000);

        List<Double> loans =
                Arrays.asList(5000.5, 6000.5);

        List<String> loanstring =
                Arrays.asList("5000.5", "6000.5");

        BankAnalytics analytics =
                new BankAnalytics();

        System.out.println(
                analytics.totalBalance(savings)
        );

        System.out.println(
                analytics.totalBalance(loans)
        );

//        System.out.println(
//                analytics.totalBalance(loanstring)   //This will give error as totalBalance expects parameter of type Number
//        );
    }
}
