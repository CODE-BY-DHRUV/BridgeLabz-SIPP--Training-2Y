import college.student.Student;
import college.faculty.Faculty;

public class MainApp {
    public static void main(String[] args) {
        Student s = new Student("Dhruv", 101);
        Faculty f = new Faculty("Mr. Verma", "Java");

        s.display();
        f.display();
    }
}

