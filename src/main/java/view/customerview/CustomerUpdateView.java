package view.customerview;

import model.Customer;
import model.CustomerList;

import java.util.Scanner;

public class CustomerUpdateView {

    public CustomerList customerList;

    public CustomerUpdateView(CustomerList customerList) {
        this.customerList = customerList;
    }

    public void get(){
        System.out.println();
        System.out.println("## update a customer ##");
        System.out.println();
        Scanner sc = new Scanner(System.in);
        System.out.print("-> Type customerId: ");
        int customerId = sc.nextInt();
        System.out.println();
        System.out.print("-> Type firstName: ");
        String firstName = sc.next();
        System.out.println();
        System.out.print("-> Type lastName: ");
        String lastName = sc.next();
        System.out.println();
        System.out.print("-> Type email: ");
        String email = sc.next();
        System.out.println();
        System.out.print("-> Type telephoneNumber: ");
        String telephoneNumber = sc.next();
        System.out.println();
        System.out.print("-> Type streetName: ");
        String streetName = sc.next();
        System.out.println();
        System.out.print("-> Type houseNumber: ");
        String houseNumber = sc.next();
        System.out.println();
        System.out.print("-> Type zipCode: ");
        String zipCode = sc.next();
        System.out.println();
        System.out.print("-> Type city: ");
        String city = sc.next();
        System.out.println();
        System.out.print("-> Type country: ");
        String country = sc.next();
        System.out.println();
        System.out.println("customer updated..");
        System.out.println();
        Customer newCustomer = customerList.updateCustomer(customerId, firstName, lastName, email, telephoneNumber, streetName, houseNumber, zipCode, city, country);
        CustomerView.get(newCustomer);
    }
}
