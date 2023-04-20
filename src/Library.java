import java.util.ArrayList;
import java.util.List;

public class Library {
	private ArrayList<Book>books = new ArrayList<>();
	private ArrayList<User>guests = new ArrayList<>();
	
	//fill this class with all necessary fields
	//as well as do not forget to add constructor, which will allow to create an instance of that class later on
	//note: create an arraylist of books and students within the constructor (why?). 


	public Library() {
	}

	//this method allows to add book to library
	public void addBook(Book book) {
		this.books.add(book);
		
	}
	//this method allows to add students to library
	public void addGuests(User user) {
		this.guests.add(user);
	}
	//this method allows to increase amount of a certain book in a library after its return from a student 
	public void increaseBookQuantity(int a, Book book) {
		this.books.remove(book);
		book.setQuantity(book.getQuantity()+a);
		this.books.add(book);
	}
	//this method allows to decrease amount of a certain book in a library after its borrowing by a student 
	public void decreaseBookQuantity(int a, Book book) {
		this.books.remove(book);
		book.setQuantity(book.getQuantity()-a);
		this.books.add(book);
	}
	//this method allows to borrow a certain book by a certain student; as well as here we have to decrease amount of taken book
	public void addBookToStudent(Book book,User student) {
		student.borrowBook(book);
	}
	//this method allows to return a certain book by a certain student; as well as here we have to increase amount of returned book
	public void returnBookFromStudent(User student, Book book){
		student.returnBook(book);
	}
	
	//this method allows to print info about all books in library, including overall their amount and so on
	public void printBooksInformation() {
		for (int i = 0; i < this.books.size(); i++) {
			System.out.println(books.get(i).toString());
		}


	}
	//this method allows to print info about all registered students in library, including overall their amount and so on
	public void printStudentsInformation() {
		for (int i = 0; i < this.guests.size(); i++) {
			System.out.println(this.guests.get(i).toString());
		}
	}
	//this method allows to show info about borrowed books for a certain student
	public void printStudentsBooks(User student) {
		student.printBooks();
	}
	public Book searchBook(String title){
		for (int i = 0; i < this.books.size(); i++) {
			if(title.equals(books.get(i).getTitle()))return books.get(i);
		}
		return null;
	}

	public User searchStudent(String name){
		for (int i = 0; i < this.guests.size(); i++) {
			if(name.equals(guests.get(i).getName()))return guests.get(i);
		}
		return null;
	}
	public User searchUserbyId(int id){
		for (int i = 0; i < this.guests.size(); i++) {
			if(id == guests.get(i).getId()){
				return guests.get(i);
			}
		}
		return null;
	}

	public  String printStrBook(){
		String as = null;
		for(Book book : books){
			as = String.valueOf(book);
		}
		return as;
	}

}
