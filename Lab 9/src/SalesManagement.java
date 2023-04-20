import java.util.ArrayList;

public class SalesManagement {
    private final ArrayList<Product> products;
    private final ArrayList<User> users;
    private final ArrayList<Order> orders;



    public SalesManagement() {
        this.products = new ArrayList<>();
        this.users = new ArrayList<>();
        this.orders = new ArrayList<>();


    }

    public void AddProducts(Product product){ products.add(product);}
    public void AddUser(User user){users.add(user);}
    public void AddOrder(Order order){orders.add(order);}






    public void printAllUsers(){
        for(User user : users)
            System.out.println(user);

    }public void printAllProducts(){
        for(Product product : products)
            System.out.println(product);

    }public void printAllOrder(){
        for(Order order : orders)
            System.out.println(order);

    }

    @Override
    public String toString() {
        return "SalesManagment{" +
                "products=" + products +
                ", users=" + users +
                ", orders=" + orders ;
    }
}
