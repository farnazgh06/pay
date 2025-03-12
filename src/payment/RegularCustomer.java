package payment;

 public class RegularCustomer extends Customer {

     public RegularCustomer(String name){
         super(name);
         super(paymentHistory);
     }

     @Override
     public void  displayCustomerInfo(){
         System.out.println("RegularCustomer" + name);
     }

}
