package miscellaneous.generics.example4_wildcards.bounded_wildcard.upperbounded;

import java.util.List;

public class BankAnalytics {
    //Total Balance operation should be related to number only
    public double totalBalance(List<? extends Number> balances) {

        double total = 0;

        for (Number balance : balances) {
            total += balance.doubleValue();
        }

        return total;
    }
}
