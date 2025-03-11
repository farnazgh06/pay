package payment;

public class PayPalPayment implements PaymentStrategy {
    public String email;

    public PaymentStrategy(String email){
        this.email = email;
    }

    @Override
    public void pay(double amount) {
        System.out.println (amount + " $, " + "Email شddress : " + email);
    }

    @Override
    public String getPaymentDetails(){
        return email + "Paid with PayPal";
    }
}
