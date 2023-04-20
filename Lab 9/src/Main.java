
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        SalesManagement sales = new SalesManagement();


        User[] users =new User[1];
        for(int i = 0; i < users.length; i++){
            System.out.print("Enter user type (Ordinary = 1; Prime = 2; Loyal = 3): ");
            String s = sc.next();
            switch (s) {
                case "1" -> {
                    users[i] = new OrdinaryUser();
                    users[i].setId(sc.nextInt());
                    users[i].setName(sc.next());
                    users[i].setSurname(sc.next());
                    users[i].setBalance(sc.nextDouble());
                    users[i].setBalance1(users[i].getBalance());
                    break;
                }
                case "2" -> {
                    users[i] = new PrimeUser();
                    users[i].setId(sc.nextInt());
                    users[i].setName(sc.next());
                    users[i].setSurname(sc.next());
                    users[i].setBalance(sc.nextDouble());
                    break;
                }
                case "3" -> {
                    users[i] = new LoyalUser();
                    users[i].setId(sc.nextInt());// int
                    users[i].setName(sc.next());//Str
                    users[i].setSurname(sc.next());
                    users[i].setBalance(sc.nextDouble());
                    break;
                }
                default -> System.out.println(" E R R O R ! ! !");
            }

        }


        //Product
        System.out.println("Product: ");
        int m = sc.nextInt();
        Product[] products = new Product[m];
        for(int i =0; i < products.length;i++){
            products[i] = new Product();
            products[i].setId(sc.nextInt());
            products[i].setName(sc.next());
            products[i].setQuantity(sc.nextInt());
            products[i].setPrice(sc.nextDouble());

        }



        //Order
        System.out.println("Order: ");
        int s = sc.nextInt();
        Order[] orders = new Order[s];
        for(int i = 0; i < orders.length;i++){
            orders[i] = new Order();
            orders[i].setUserid(sc.nextInt());
            orders[i].setProductName(sc.next());
            orders[i].setQuantity(sc.nextInt());
        }

        double Balance1 = 0;
        int TotalOrder = 0;
        for(int i =0; i < orders.length; i++){
            for(User user : users ){
                for (Product product : products){
                    if(orders[i].getUserid() == user.getId() && orders[i].getProductName().equals(product.getName())){
                        double totalSum;
                        totalSum = product.getPrice() * orders[i].getQuantity();
                        if(totalSum <= user.getBalance() && orders[i].getQuantity() <= product.getQuantity()){
                            System.out.println("Сhoose the type of delivery(Regular; Express; SuperExpress): ");
                            String type = sc.next();
                            switch (type) {
                                case "Regular" -> {
                                    product.setQuantity(product.getQuantity() - orders[i].getQuantity());
                                    user.computeAfterBalance(orders[i], product);
                                    user.OrderHistory(orders[i]);
                                    user.setBalance(user.getBalance() - user.computeAfterBalance(orders[i], product));
                                    System.out.println(" - Delivery for u free.Your delivery will arrive in 7 days ");
                                    break;

                                }
                                case "Express" -> {
                                    double deliveryPrice;
                                    product.setQuantity(product.getQuantity() - orders[i].getQuantity());
                                    user.computeAfterBalance(orders[i], product);
                                    user.OrderHistory(orders[i]);
                                    deliveryPrice = user.computeAfterBalance(orders[i], product) + (user.computeAfterBalance(orders[i], product) * 0.05);
                                    user.setBalance((user.getBalance())-deliveryPrice);
                                    System.out.println("Delivery for u: " + deliveryPrice + " - Your delivery will arrive in 3 days ");
                                    break;
                                }
                                case "SuperExpress" -> {
                                    double deliveryPrice;
                                    product.setQuantity(product.getQuantity() - orders[i].getQuantity());
                                    user.computeAfterBalance(orders[i], product);
                                    user.OrderHistory(orders[i]);
                                    deliveryPrice = user.computeAfterBalance(orders[i], product) + (user.computeAfterBalance(orders[i], product) * 0.08);
                                    user.setBalance((user.getBalance())-deliveryPrice);
                                    System.out.println("Delivery for u: " + deliveryPrice + " - Your delivery will arrive tomorrow ");
                                    break;
                                }
                            }
                        }


                    }
                }
            }
        }




        for(User user : users ){
            sales.AddUser(user);

        }
        for (Product product : products) {
            sales.AddProducts(product);
        }
        for (Order order : orders) {
            sales.AddOrder(order);

        }






        System.out.print("all users : " ) ;
        sales.printAllUsers();
        System.out.print("list of products : ");
        sales.printAllProducts();
        System.out.print("list of orders : ");
        sales.printAllOrder();



    }
}