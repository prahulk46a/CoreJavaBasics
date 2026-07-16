package Exceptions.custom_exception_throw;

public class Main {
    public static void main(String[] args) {
        BankService bank = new BankService();
        try {
            bank.withdraw(1000, 5000);
        } catch (InsufficientBalanceException e) {
            System.out.println(e.getMessage());
        }
    }
}
