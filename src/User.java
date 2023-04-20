import java.util.ArrayList;

public class User {
    private int id;
    private String name;
    private String surname;
    private String group;
    private ArrayList<Book> borrowedBooks = new ArrayList<>();
    public User(int id, String name, String surname, String group) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.group = group;
    }


    public void borrowBook(Book book) {
        this.borrowedBooks.add(book);
        book.setQuantity(book.getQuantity()-1);
    }

    public void returnBook(Book book) {
        this.borrowedBooks.remove(book);
        book.setQuantity(book.getQuantity()+1);
    }

    public void printBooks() {
        String books="";
        for (int i = 0; i < this.borrowedBooks.size(); i++) {
            books+=this.borrowedBooks.get(i).getTitle();
            books+="\n";
        }
        System.out.println("Student "+this.name+" has the list of books: "+books);
    }
    public String getName() {
        return this.name;
    }

    public int getId() {
        return id;
    }
    public String getSurname() {
        return surname;
    }

    public String getGroup() {
        return group;
    }

    public ArrayList<Book> getBorrowedBooks() {
        return borrowedBooks;
    }
    public String check(int id){
        if(id > 19999 && id < 30000){
            return "this is a student";
        }
        else return "this is a pupil";
    }
}
