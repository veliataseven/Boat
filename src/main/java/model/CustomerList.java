package model;

import java.util.ArrayList;
import java.util.List;

public class CustomerList {
    public List<Customer> customers = new ArrayList<>();

    public CustomerList(){}

    public List<Customer> getCustomers() {
        return customers;
    }

    public Customer getCustomer(int customerId) {
        for (Customer customer : customers) {
            if (customer.getCustomerId() == customerId) {
                return customer;
            }
        }
        return null;
    }

    public Customer createCustomer(int customerId, String firstName, String lastName, String email, String telephoneNumber, String streetName, String houseNumber, String zipCode, String city, String country) {
        Customer newCustomer = new Customer(customerId, firstName, lastName, email, telephoneNumber, streetName, houseNumber, zipCode, city, country);
        customers.add(newCustomer);
        return newCustomer;
    }

    public Customer deleteCustomer(int customerId){
        Customer customerToBeRemoved = getCustomer(customerId);
        customers.remove(customerToBeRemoved);
        return customerToBeRemoved;
    }

    public Customer updateCustomer(int customerId, String firstName, String lastName, String email, String telephoneNumber, String streetName, String houseNumber, String zipCode, String city, String country) {
        Customer customerToBeUpdated = getCustomer(customerId);
        customerToBeUpdated.setFirstName(firstName);
        customerToBeUpdated.setLastName(lastName);
        customerToBeUpdated.setEmail(email);
        customerToBeUpdated.setTelephoneNumber(telephoneNumber);
        customerToBeUpdated.setStreetName(streetName);
        customerToBeUpdated.setHouseNumber(houseNumber);
        customerToBeUpdated.setZipCode(zipCode);
        customerToBeUpdated.setCity(city);
        customerToBeUpdated.setCountry(country);

        return customerToBeUpdated;
    }

    @Override
    public String toString() {
        return "CustomerList{" +
                "customers=" + customers +
                '}';
    }
}
