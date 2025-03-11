package payment;

class PermiumCustomer extends Customer {

    public PermiumCustomer(String name){
        super(name);
    }

    @Override
    public void  displayCustomerInfo(){
        System.out.println("PermiumCustomer");
    }

}
