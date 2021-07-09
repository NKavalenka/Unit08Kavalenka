package by.epam.unit08.main;

import by.epam.unit06.main.task03.Book;

import java.util.ArrayList;
import java.util.List;

public class CustomerList {
    private List<Customer> customers;

    public List<Customer> getCustomers() {
        return customers;
    }

    public void setCustomers(List<Customer> customers) {
        this.customers = customers;
    }

    public CustomerList() {
        this.customers = new ArrayList<Customer>();
    }

    public void add(Customer customer) {
        customers.add(customer);
    }

    public Customer getCustomer(int id) {
        return customers.get(id);
    }

    public void sortCustomers() {
        customers.sort(new SortCustomers());
    }

    public int size() {
        return customers.size();
    }

    public List getCreditCardList(long min, long max) {
        List<Customer> cardList = new ArrayList<Customer>();

        for (Customer customer : customers) {
            if (customer.getCreditCard() > min && customer.getCreditCard() < max) {
                cardList.add(customer);
            }
        }
        return cardList;
    }


}
