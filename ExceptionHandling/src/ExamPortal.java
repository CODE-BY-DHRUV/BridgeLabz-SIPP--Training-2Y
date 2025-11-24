import java.io.IOException;

class InvalidStudentException extends Exception { public InvalidStudentException(String m){super(m);} }

class OnlineExam {
    public void validateStudent(String student) throws InvalidStudentException {
        if (!student.equals("John"))
            throw new InvalidStudentException("Student not found!");
    }

    public void submitExam(String student) throws InvalidStudentException, IOException {
        validateStudent(student);
        throw new IOException("System error while submitting exam!");
    }
}

public class Main {
    public static void main(String[] args) {
        OnlineExam oe = new OnlineExam();

        try {
            oe.submitExam("Mark");
        } catch (InvalidStudentException | IOException e) {
            System.out.println("Exam error: " + e.getMessage());
        } finally {
            System.out.println("Exam submission process completed.");
        }
    }
}

