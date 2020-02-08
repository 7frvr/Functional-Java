package functionalinterface;

import java.util.function.Consumer;

public class _Consumer {
    public static void main(String[] args) {

        // Normal java function
        Customer amraa = new Customer(" Amraa", "99295341");
        greetCustomer(amraa);

        // Consumer Functional interface
        greetCustomerConsumer.accept(amraa);
    }

    static void greetCustomer(Customer customer){
        System.out.println("Hello" + customer.customerName +
                ", thanks for reg PN " + customer.customerPhoneNumber);
    }


    static Consumer<Customer> greetCustomerConsumer = customer ->
            System.out.println("Hello" + customer.customerName +
                    ", thanks for reg PN " + customer.customerPhoneNumber);


    static class Customer{
        private final String customerName;
        private final String customerPhoneNumber;

        Customer(String customerName, String customerPhoneNumber) {
            this.customerName = customerName;
            this.customerPhoneNumber = customerPhoneNumber;
        }
    }
}
