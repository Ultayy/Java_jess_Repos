import java.util.ArrayList;
import java.util.List;

public class Student extends User {
	public Student(int id, String name, String surname, String group) {
		super(id, name, surname, group);
	}
	public String check(int id){
		return "this is a student";
	}

	@Override
	public String toString() {
		return "Student id:" + this.getId() + "\nname: " + this.getName() + "\nsurname: " + this.getSurname() + "\ngroup: " + this.getGroup() + "\nborrowedBooks: " + this.getBorrowedBooks() + "\n-----------------";
	}

}
