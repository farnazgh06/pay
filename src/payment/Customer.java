package payment;

import java.util.ArrayList;

    public abstract class Customer {
        public String name;
        public ArrayList<String> paymentHistory;


    public Customer(String name) {
            this.name = name;
            this.paymentHistory = new ArrayList<String>();
        }

        public abstract void displayCustomerInfo ();

        public void makePayment (PaymentStrategy paymentStrategy, double amount){
            paymentStrategy.pay(amount);
            String payDetails = paymentStrategy.getPaymentDetails();
            paymentHistory.add(payDetails);

        }

        public void showPaymentHistory () {
            for (String payment : paymentHistory) {
                System.out.print(payment);
            }
        }

    }
