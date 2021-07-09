package by.epam.unit08.main;

public class CustomerProgram {
    public static void main(String[] args) {
        CustomerList customerList = new CustomerList();
        customerList.add(new Customer(1, "John", "Doe", "Albertovich", "UK", 1234123412341234L, 123));
        customerList.add(new Customer(2, "Jane", "White", "Viktorovna", "USA", 4321432143214321L, 321));
        customerList.add(new Customer(3, "Petr", "Pervij", "Velikij", "RU", 8888777788887777L, 878));
        customerList.add(new Customer(4, "Jan", "Apricot", "Zaharovich", "PL", 9999555500005555L, 905));

        System.out.println("Sort Customers by Last name: ");
        customerList.sortCustomers();
        for (int i = 0; i < customerList.size(); i++){
            System.out.println("["+customerList.getCustomer(i).toString()+"]");
        }
        System.out.println();

        System.out.println("Get Customers with Credit card in 100000000000-7000000000000000 :");
            System.out.println(customerList.getCreditCardList(100000000000L, 7000000000000000L).toString());
    }
}
