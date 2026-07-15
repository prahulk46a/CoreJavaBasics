package miscellaneous.generics.example2;

public class Main {
    public static void main(String[] args) {
        EventPublisher<AccountCreatedEvent> accounEventPublisher = new EventPublisher<>();
        EventPublisher<LoanApprovedEvent> loanApprovedEventPublisher = new EventPublisher<>();
        EventPublisher<MoneyTransferredEvent> moneyTransferredEventPublisher = new EventPublisher<>();
    }
}
