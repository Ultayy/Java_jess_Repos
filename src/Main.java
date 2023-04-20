import java.util.List;
import java.util.Scanner;
import java.io.*;

public class Main {

	public static void main(String[] args) {
		//initialize some scanner

		Scanner in = new Scanner(System.in);
		//create an instance of library class
		User[] users = new User[100];
		Book[] books = new Book[100];
		Library library = new Library();
		int choice = -1;

		while (choice != 0) {
			System.out.println("Welcome to the IITU Library");
			System.out.println("1. Add book");
			System.out.println("2. Add student");
			System.out.println("3. Give book to student");
			System.out.println("4. Return book from student");
			System.out.println("5. Print books information");
			System.out.println("6. Print students information");
			System.out.println("7. Print student's books");
			System.out.println("8. Add pupil");
			System.out.println("9. Check student or pupil");
			System.out.println("0. Exit");
			choice = in.nextInt();
			Scanner sc = new Scanner(System.in);
			switch (choice) {
				case 1:
					//here you have to add an opportunity to create an instance of a book class
					//and
					//then you have to call corresponding method from library class in order to add created book
					System.out.println("How many books do you want to add: ");
					int a = sc.nextInt();

					for (int i = 0; i < a; i++) {
						BufferedReader br = null;
						books[i] = new Book();
						try {

							br = new BufferedReader(new FileReader("BookTiitle.txt"));
							String line;
							while ((line = br.readLine()) != null) {

								books[i].setTitle(line);

							}
						} catch (IOException e) {
							System.out.println("Error" + e);
						}


						System.out.print("Author: ");
						books[i].setAuthor(sc.next());
						System.out.print("ISBN: ");
						books[i].setIsbn(sc.next());
						System.out.print("Year: ");
						books[i].setYear(sc.nextInt());
						System.out.print("Quantity: ");
						books[i].setQuantity(sc.nextInt());
						System.out.print("ToWhom: ");
						books[i].setToWhom(sc.next());
						library.addBook(books[i]);

					}
					for (int i = 0; i < a; i++) {
						System.out.println(books[i].getTitle() + " " + books[i].getToWhom());
					}
			break;
				case 2:
				// same as for case 1, but for "student" object
					System.out.println("You need to input student's id, name, surname, group");

						Student student = new Student(sc.nextInt(),sc.next(),sc.next(),sc.next());
					if(student.getId() > 19999 && student.getId() < 30000){
						library.addGuests(student);
					}
					else {
						System.out.println("Error");
					}
					break;
				case 3:
				//here you have to call corresponding method for adding a certain book for a certain student
					System.out.println("Type book's title and student's name:");
					String bookTitle = sc.next();
					String studentName = sc.next();
					Book book1 = library.searchBook(bookTitle);
					User student1 = library.searchStudent(studentName);
					library.addBookToStudent(book1,student1);
					break;
				case 4:
				//here you have to call corresponding method for returning a certain book from a certain student
					System.out.println("Type book's title and student's name:");
					String bookTitle1 = sc.next();
					String studentName1 = sc.next();
					Book book2 = library.searchBook(bookTitle1);
					User student2 = library.searchStudent(studentName1);
					library.returnBookFromStudent(student2,book2);
					break;
				case 5:
					library.printBooksInformation();
					break;
				case 6:
					library.printStudentsInformation();
					break;
				case 7:
				//here you have to call method in order to print info about books holded by a certain student
					System.out.println("Type Student's name:");
					String studentName2 = sc.next();
					User student3 = library.searchStudent(studentName2);
					library.printStudentsBooks(student3);
					break;
				case 8:
					// same as for case 1, but for "student" object
					System.out.println("You need to input student's id, name, surname, group");
					Pupil pupil = new Pupil(sc.nextInt(),sc.next(),sc.next(),sc.next());
					if(pupil.getId() > 9999 && pupil.getId() < 20000){
						library.addGuests(pupil);
					}
					else {
						System.out.println("Error");
					}
					break;
				case 9:
					System.out.println("find User by id");
					int id = sc.nextInt();
					User user = library.searchUserbyId(id);
					System.out.println(user.check(id));
				case 10:
					try {
						File file = new File("Book.txt");
						if (!file.exists()) {
							file.createNewFile();
						}

						PrintWriter pw = new PrintWriter(file);
						String as;
						as = library.printStrBook();
						pw.println(as);
						pw.close();


					} catch (IOException e) {
						System.out.println("Error " + e);
					}

			}
		}
	}
}
