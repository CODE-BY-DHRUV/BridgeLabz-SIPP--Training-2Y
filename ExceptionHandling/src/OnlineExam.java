import java.time.LocalDateTime;

class LateSubmissionException extends Exception { public LateSubmissionException(String m){super(m);} }
class InvalidFileFormatException extends Exception { public InvalidFileFormatException(String m){super(m);} }

class ExamPortal {
    LocalDateTime deadline = LocalDateTime.of(2025, 1, 10, 23, 59);

    public void submitExam(String fileName, LocalDateTime submitTime)
            throws LateSubmissionException, InvalidFileFormatException {

        if (!fileName.endsWith(".pdf"))
            throw new InvalidFileFormatException("Invalid file format!");

        if (submitTime.isAfter(deadline))
            throw new LateSubmissionException("Submission is late!");

        System.out.println("Exam submitted successfully!");
    }
}

public class Main {
    public static void main(String[] args) {
        ExamPortal ep = new ExamPortal();
        try {
            ep.submitExam("answer.docx", LocalDateTime.now());
        } catch (Exception e) {
            System.out.println("Submission failed: " + e.getMessage());
        }
    }
}
