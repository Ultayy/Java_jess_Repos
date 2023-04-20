import java.util.ArrayList;

public class LoyalUser extends User{
    private double cashback;

    public LoyalUser(int id, String name, String surname, double balance, double cashback) {
        super(id, name, surname, balance);
        this.cashback = cashback;
    }
    public void computemoney() {

    }
}
