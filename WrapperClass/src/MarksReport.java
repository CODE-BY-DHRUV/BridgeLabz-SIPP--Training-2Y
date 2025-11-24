import java.util.*;

public class MarksReport {
    public static void main(String[] args) {

        String[] inputs = {"85", "95", "null", "88", "abc"};

        ArrayList<Integer> list = new ArrayList<>();

        for (String s : inputs) {
            try {
                list.add(Integer.parseInt(s));
            } catch (Exception e) { }
        }

        double avg = list.stream().mapToInt(Integer::intValue).average().orElse(0);

        System.out.println("Average Marks = " + avg);
    }
}
