public class Book {
    private String title;
    private String author;
    private String isbn;
    private int year;
    private int quantity;
    private String toWhom;

    public Book() {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.year = year;
        this.quantity = quantity;
        this.toWhom = toWhom;
    }
    public String getAuthor() {
        return author;
    }
    public String getIsbn() {
        return isbn;
    }
    public int getYear() {
        return year;
    }
    public String getTitle() {
        return title;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    public String getToWhom() {
        return toWhom;
    }

    public void setToWhom(String toWhom) {
        this.toWhom = toWhom;
    }


    @Override
    public String toString() {
        return ("Book title: "+this.title+"\nbook author: "+this.author+"\nbook isbn:"+this.isbn+"\nbook year: "+this.year+"\nbook quantity: "+this.quantity+"\n------------------------------");
    }

    public void setTitle(String title) {
        this.title = title;
    }
    public void setAuthor(String author){
        this.author = author;
    }
    public void setIsbn(String isbn){
        this.isbn = isbn;
    }
    public void setYear(int year){
        this.year = year;
    }
}
