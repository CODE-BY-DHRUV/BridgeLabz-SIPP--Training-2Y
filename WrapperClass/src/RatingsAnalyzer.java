import java.util.*;

public class RatingsAnalyzer {
    public static void main(String[] args) {

        int[] ratingsPrimitive = {5, 4, 3};
        ArrayList<Integer> ratingsObj = new ArrayList<>(Arrays.asList(4, null, 5));

        ArrayList<Integer> combined = new ArrayList<>();

        for (int r : ratingsPrimitive)
            combined.add(r);  // auto-box

        combined.addAll(ratingsObj);

        double avg = combined.stream()
                .filter(Objects::nonNull)
                .mapToInt(Integer::intValue)
                .average()
                .orElse(0);

        System.out.println("Average Rating = " + avg);
    }
}

