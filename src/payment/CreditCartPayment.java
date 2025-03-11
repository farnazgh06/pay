package payment;

public class CreditCartPayment implements PaymentStrategy {
    public String cardNumber;
    public String cardHolderName;

    public CreditCartPayment(String cardNumber, String cardHolderName) {
        this.cardNumber = cardNumber;
        this.cardHolderName = cardHolderName;
    }

    @Override
     public void pay(double amount) {
        System.out.println (amount + " $, " + "CardNumber : " + cardNumber + ", CardName : " +cardHolderName);
    }

    @Override
    public String getPaymentDetails(){
            return cardHolderName + cardNumber + "Paid with CreditCart";
    }


}
