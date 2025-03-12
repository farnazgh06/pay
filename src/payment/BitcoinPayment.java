package payment;

public class BitcoinPayment implements PaymentStrategy {
    public String walletAddress;

    public BitcoinPayment (String walletAddress){

        this.walletAddress = walletAddress;
    }
    @Override
    public void pay(double amount) {
        System.out.println(amount + " $, " + "Wallet Address : " + walletAddress);
    }

    @Override
    public String getPaymentDetails(){
        return walletAddress + "Paid with  Bitcoin";
    }
}
