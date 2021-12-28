package view.customerview;

import model.Customer;
import model.CustomerList;

import java.util.Scanner;

public class CustomerDeleteView {
    public CustomerList customerList;

    public CustomerDeleteView(CustomerList customerList) {
        this.customerList = customerList;
    }

    public void get(){
        System.out.println();
        System.out.println("## delete a customer ##");
        System.out.println();
        Scanner sc = new Scanner(System.in);
        System.out.print("-> Type customerId: ");
        int customerId = sc.nextInt();
        System.out.println();
        System.out.println("Customer deleted..");
        System.out.println();
        Customer deletedCustomer = customerList.deleteCustomer(customerId);
        CustomerView.get(deletedCustomer);
    }
}
