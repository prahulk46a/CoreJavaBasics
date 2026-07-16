package Exceptions.custom_exception_throw;

public class BankService {
    public void withdraw(double balance, double amount) throws InsufficientBalanceException {
        if(amount > balance) {
            throw new InsufficientBalanceException("Insufficient account balance");
        }
        System.out.println("Withdrawal Successful");
    }
}
