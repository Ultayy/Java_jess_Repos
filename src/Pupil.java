import java.util.ArrayList;

public class Pupil extends User{
    public Pupil(int id, String name, String surname, String group) {
    super(id, name, surname, group);
}
    public String check(int id){
        return "this is a pupil";
    }

    @Override
    public String toString() {
        return "Pupil id:" + this.getId() + "\nname: " + this.getName() + "\nsurname: " + this.getSurname() + "\ngroup: " + this.getGroup() + "\nborrowedBooks: " + this.getBorrowedBooks() + "\n-----------------";
    }
}
