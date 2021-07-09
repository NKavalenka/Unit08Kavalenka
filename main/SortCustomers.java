package by.epam.unit08.main;

import java.util.Comparator;

public class SortCustomers implements Comparator<Customer>{
    public int compare(Customer a, Customer b) {
        return a.getLastName().compareTo(b.getLastName());
    }
}
