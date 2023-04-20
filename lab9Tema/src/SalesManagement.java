import java.util.ArrayList;
import java.util.Scanner;

public class SalesManagement {
    Scanner scanner = new Scanner(System.in);
    private ArrayList<Product>products = new ArrayList<Product>();
    private ArrayList<User>users = new ArrayList<User>();
    private ArrayList<Order>orders = new ArrayList<Order>();
    public void addProduct()
    {
        int id = scanner.nextInt();
        String name = scanner.next();
        int quantity = scanner.nextInt();
        double price = scanner.nextDouble();
        Product product = new Product(id,name,quantity,price);
        products.add(product);
    }
    public void addOrder()
    {
        int userId = scanner.nextInt();
        String productName = scanner.next();
        int quantity = scanner.nextInt();
        Order order = new Order(userId,productName,quantity);
        orders.add(order);
    }
    public void addUser(int n)
    {

        int id = scanner.nextInt();
        String name = scanner.next();
        String surname = scanner.next();
        double balance = scanner.nextDouble();
        if(n==1)
        {
            OrdinaryUser user = new OrdinaryUser(id,name,surname,balance);
            users.add(user);
        }
        else if(n==2)
        {
            PrimeUser user = new PrimeUser(id,name,surname,balance);
            users.add(user);
        }
        else if(n==3)
        {
            double cashback = scanner.nextDouble();
            LoyalUser user = new LoyalUser(id,name,surname,balance,cashback);
            users.add(user);
        }

    }

    public ArrayList<Product> getProducts() {
        return products;
    }

    public ArrayList<User> getUsers() {
        return users;
    }

    public ArrayList<Order> getOrders() {
        return orders;
    }


}
