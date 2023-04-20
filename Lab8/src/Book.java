import javax.swing.*;

public class Book extends Product{
    private String name;
    private String publisher;
    private int yearOfPublication;

    public Book(int barcode, int regularPrice, String name, String publisher, int yearOfPublication) {
        super(barcode, regularPrice);
        this.name = name;
        this.publisher = publisher;
        this.yearOfPublication = yearOfPublication;
    }

    public String getName() {
        return name;
    }

    public String getPublisher() {
        return publisher;
    }

    public int getYearOfPublication() {
        return yearOfPublication;
    }

    @Override
    public double computeSalePrice() {
        return getRegularPrice() * 0.5;
    }
}
