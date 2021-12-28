package view.customerview;

import model.Customer;
import model.CustomerList;

public class CustomerListView {
    public CustomerList customerList;

    public CustomerListView(CustomerList customerList) {
        this.customerList = customerList;
    }

    public void get() {
        System.out.println();
        System.out.println("## list customers ##");
        System.out.println();
        for (Customer customer : customerList.getCustomers()) {
            System.out.println("customer = " + customer);
        }
    }
}
