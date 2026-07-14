package miscellaneous.Enum;
//Strategy pattern=>
public enum PaymentType {

    CREDIT_CARD{
        @Override
        public void processPayment(double amount){
            System.out.println("Processing Credit Card PaymentService of amount "+ amount +" ...");
        }
    },
    GPAY{
        @Override
        public void processPayment(double amount) {
            System.out.println("Processing GPAY PaymentService of amount "+ amount +" ...");
        }
    };
    public abstract void processPayment(double amount);
}
