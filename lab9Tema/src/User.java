import java.util.ArrayList;

public abstract class User {
    private int id;
    private String name;
    private String surname;
    private double balance;
    ArrayList<Order>orderHistory = new ArrayList<Order>();
    public abstract void computemoney();
    public User(int id, String name, String surname, double balance, ArrayList<Order> orderHistory) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.balance = balance;
        this.orderHistory = orderHistory;
    }

    public User(int id, String name, String surname, double balance) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.balance = balance;
    }

    public User() {
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public double getBalance() {
        return balance;
    }

    public ArrayList<Order> getOrderHistory() {
        return orderHistory;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setOrderHistory(ArrayList<Order> orderHistory) {
        this.orderHistory = orderHistory;
    }


}
