package controller;

import model.CustomerList;
import view.boatview.*;
import view.customerview.*;

public class CustomerController {
    public CustomerList customerList;

    public CustomerController() {
    }

    public CustomerController(CustomerList customerList) {
        this.customerList = customerList;
    }

    public void execute() {

        CustomerListView customerListView = new CustomerListView(customerList);
        CustomerFindView customerFindView = new CustomerFindView(customerList);
        CustomerCreateView customerCreateView = new CustomerCreateView(customerList);
        CustomerDeleteView customerDeleteView = new CustomerDeleteView(customerList);
        CustomerUpdateView customerUpdateView = new CustomerUpdateView(customerList);

        outer:
        while (true) {
            int choice = CustomerMenuView.get();
            switch (choice) {
                case 1:
                    customerListView.get();
                    break;
                case 2:
                    customerFindView.get();
                    break;
                case 3:
                    customerCreateView.get();
                    break;
                case 4:
                    customerDeleteView.get();
                    break;
                case 5:
                    customerUpdateView.get();
                    break;
                case 6:
                    break outer;
            }
        }
    }

    @Override
    public String toString() {
        return "CustomerController{" +
                "customerList=" + customerList +
                '}';
    }
}
