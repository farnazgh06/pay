package payment;

public class PermiumCustomer extends Customer {

    public PermiumCustomer(String name){
        super(name);
        super(paymentHistory);
    }

    @Override
    public void  displayCustomerInfo(){
        System.out.println("PermiumCustomer" + name);
    }

}
