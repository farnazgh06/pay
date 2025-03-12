import payment.PaymentStrategy;
import payment.CreditCartPayment;
import payment.PayPalPayment;
import payment.BitcoinPayment;
import payment.Customer;
import payment.PermiumCustomer;
import payment.RegularCustomer;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        Customer RCustomer = new RegularCustomer("RCustomer");
        Customer PCustomer = new PermiumCustomer("PCustomer");
        Customer PCustomer2 = new PermiumCustomer("PCustomer2");

        // پرداخت
        String cardNumber = scn.nextLine();
        String cardHolderName = scn.nextLine();

        String email = scn.nextLine();

        String walletAddress = scn.nextLine();

        PaymentStrategy CreditCartPayment = new CreditCartPayment(cardNumber, cardHolderName);
        PaymentStrategy PayPalPayment = new PayPalPayment(email);
        PaymentStrategy BitcoinPayment = new CreditCartPayment(walletAddress);

        //پرداخت 2 مرحله ای
        double amount1 = scn.nextDouble();
        double amount2 = scn.nextDouble();

        RCustomer.makePayment(PayPalPayment, amount1);
        RCustomer.makePayment(CreditCartPayment, amount2);

        PCustomer.makePayment(BitcoinPayment, amount1);
        PCustomer.makePayment(PayPalPayment, amount2);

        PCustomer2.makePayment(BitcoinPayment, amount1);
        PCustomer2.makePayment(CreditCartPayment, amount2);

        // نمایش اطلاعات
        RCustomer.displayCustomerInfo();
        PCustomer.displayCustomerInfo();
        PCustomer2.displayCustomerInfo();


    }
}