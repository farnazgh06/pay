import payment.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        // ورودی سه مشتری
        String regular = scn.nextLine();
        String permium1 = scn.nextLine();
        String permium2 = scn.nextLine();

        //ایجاد سه مشتری
        Customer RegularCustomer = new RegularCustomer(regular);
        Customer PermiumCustomer = new PermiumCustomer(permium1);
        Customer PermiumCustomer = new PermiumCustomer(permium2);

        // پرداخت
        regular.makePayment(scanner.nextDouble());
        regular.makePayment(scanner.nextDouble());

        premium1.makePayment(scanner.nextDouble());
        premium1.makePayment(scanner.nextDouble());

        premium2.makePayment(scanner.nextDouble());
        premium2.makePayment(scanner.nextDouble());

        //پرداخت 2 مرحله ای
        double amount1 = scanner.nextDouble();
        double amount2 = scanner.nextDouble();

        regular.makePayment(PayPalPayment, amount1);
        regular.makePayment(CreditCartPayment, amount2);

        premium1.makePayment(BitcoinPayment, amount1);
        premium1.makePayment(PayPalPayment, amount2);

        premium2.makePayment(BitcoinPayment, amount1);
        premium2.makePayment(CreditCartPayment, amount2);

        // نمایش اطلاعات
        regular.displayCustomerInfo();
        premium1.displayCustomerInfo();
        premium2.displayCustomerInfo();


    }
}