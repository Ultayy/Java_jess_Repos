public class PrimeUser extends User{
    @Override
    public int getId() {
        return super.getId();
    }

    @Override
    public void setId(int id) {
        super.setId(id);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public String getSurname() {
        return super.getSurname();
    }

    @Override
    public void setSurname(String surname) {
        super.setSurname(surname);
    }

    @Override
    public double getBalance() {
        return super.getBalance();
    }

    @Override
    public void setBalance(double balance) {
        super.setBalance(balance);
    }
    public void setBalance1(double balance) {
        super.setBalance1(balance);
    }

    public double computeAfterBalance(Order order, Product product) {
        setBalance1((order.getQuantity()) * product.getPrice());
        return getBalance1();
    }
}
