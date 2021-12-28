package view.customerview;

import model.Boat;
import model.Customer;
import model.CustomerList;
import view.boatview.BoatView;

import java.util.Scanner;

public class CustomerFindView {
    public CustomerList customerList;

    public CustomerFindView(CustomerList customerList) {
        this.customerList = customerList;
    }

    public void get(){
        System.out.println();
        System.out.println("## find a customer ##");
        System.out.println();
        Scanner sc = new Scanner(System.in);
        System.out.print("-> Type customerId: ");
        int customerId = sc.nextInt();
        System.out.println();
        System.out.println("Customer founded..");
        System.out.println();
        Customer foundedCustomer = customerList.getCustomer(customerId);
        CustomerView.get(foundedCustomer);
    }

}
