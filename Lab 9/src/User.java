import java.util.ArrayList;

public abstract class User {
    private int id;
    private String name;
    private String surname;
    private double balance;;
    private double balance1;;
    private ArrayList <Order> orderHistory;
    public User(){}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public double getBalance() {
        return balance;
    }
    public double getBalance1() {
        return balance1;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }


    public ArrayList<Order> getOrderHistory() {
        return orderHistory;
    }


    public void OrderHistory(Order order) {
        orderHistory = new ArrayList<Order>();
        orderHistory.add(order);
    }

    public abstract double computeAfterBalance(Order order, Product product);

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", balance=" + balance +
                ", orderHistory=" + orderHistory +
                '}';
    }

    protected void setBalance1(double balance1) {
        this.balance1 = balance1;
    }
}
