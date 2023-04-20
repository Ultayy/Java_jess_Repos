import java.awt.print.Book;

public abstract class Product {
    private int barcode;
    private int regularPrice;

    public Product(int barcode, int regularPrice) {
        this.barcode = barcode;
        this.regularPrice = regularPrice;
    }

    public int getBarcode() {
        return barcode;
    }

    public int getRegularPrice() {
        return regularPrice;
    }

    public abstract double computeSalePrice();
}
