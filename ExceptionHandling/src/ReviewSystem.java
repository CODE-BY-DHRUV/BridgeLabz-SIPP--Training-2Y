class InvalidRatingException extends Exception { public InvalidRatingException(String m){super(m);} }
class EmptyReviewException extends Exception { public EmptyReviewException(String m){super(m);} }

class ReviewSystem {
    public void submitReview(int rating, String comment)
            throws InvalidRatingException, EmptyReviewException {

        if (rating < 1 || rating > 5)
            throw new InvalidRatingException("Rating must be between 1 and 5!");

        if (comment == null || comment.trim().isEmpty())
            throw new EmptyReviewException("Review comment cannot be empty!");

        System.out.println("Review submitted!");
    }
}

public class Main {
    public static void main(String[] args) {
        ReviewSystem rs = new ReviewSystem();

        try {
            rs.submitReview(6, "");
        } catch (InvalidRatingException e) {
            System.out.println("Rating error: " + e.getMessage());
        } catch (EmptyReviewException e) {
            System.out.println("Comment error: " + e.getMessage());
        }
    }
}
