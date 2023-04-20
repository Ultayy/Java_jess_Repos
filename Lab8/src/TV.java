public class TV extends Product{
    private String typeTV;
    private double screenSize;

    public TV(int barcode, int regularPrice, String typeTV, double screenSize) {
        super(barcode, regularPrice);
        this.typeTV = typeTV;
        this.screenSize = screenSize;
    }

    public String getTypeTV() {
        return typeTV;
    }

    public double getScreenSize() {
        return screenSize;
    }
    @Override
    public double computeSalePrice() {
        // implementation of computeSalePrice for TV
        return getRegularPrice() * 1.2; // 10% discount
    }
}
