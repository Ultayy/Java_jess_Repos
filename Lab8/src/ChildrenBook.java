public class ChildrenBook extends Book{
    private int age;

    public ChildrenBook(int barcode, int regularPrice, String name, String publisher, int yearOfPublication, int age) {
        super(barcode, regularPrice, name, publisher, yearOfPublication);
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    @Override
    public double computeSalePrice() {
            return getRegularPrice() * 0.25;
    }
}
