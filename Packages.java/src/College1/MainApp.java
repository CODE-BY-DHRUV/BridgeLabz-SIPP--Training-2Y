import college.student.*;
import college.faculty.*;
import college.department.*;

public class MainApp {
    public static void main(String[] args) {
        Student s = new Student("Rahul");
        Faculty f = new Faculty("Mehta Sir");
        Department d = new Department("Computer Science");

        s.show();
        f.show();
        d.show();
    }
}

