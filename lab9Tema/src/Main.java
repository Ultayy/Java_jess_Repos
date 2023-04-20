import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int netacad =-1;
        int n=0;

        SalesManagement salesManagement = new SalesManagement();
        while(netacad!=0)
        {
            netacad = scanner.nextInt();
            if(netacad==1)
            {
                System.out.println("Введите продукт");
                salesManagement.addProduct();
            }
            else if(netacad==2)
            {
                for(Product product : salesManagement.getProducts())
                {
                    System.out.println(product.getId()+" "+product.getName()+" "+ product.getQuantity()+" "+product.getPrice());
                }
            }
            else if(netacad==3)
            {
                System.out.println("Введите заказ");
                salesManagement.addOrder();
            }
            else if(netacad==4)
            {
                for(Order order : salesManagement.getOrders())
                {
                    System.out.println(order.getUserId()+" "+ order.getProductName()+" "+order.getQuantity());
                }
            }
            else if(netacad == 5)
            {
                System.out.println("1 - Ordinary User");
                System.out.println("2 - Prime User");
                System.out.println("3 - Loyal User");
                n = scanner.nextInt();
                salesManagement.addUser(n);
            }


            else if(netacad==6)
            {

                System.out.println(salesManagement.toString());

            }
        }
    }
}