public class Order {
    private int userid;
    private String productName;
    private int quantity;

    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }


    @Override
    public String toString() {
        return "Order{" +
                "userid=" + userid +
                ", productName='" + productName + '\'' +
                ", quantity=" + quantity +
                '}';
    }
}
