import java.util.*;

public class SubjectMarks {
    public static void main(String[] args) {
        Map<String, Map<String, Integer>> marks = new HashMap<>();

        marks.put("Math", Map.of("A",90,"B",85,"C",95));
        marks.put("Science", Map.of("A",88,"B",92,"C",70));
        marks.put("English", Map.of("A",75,"B",80,"C",65));

        for(String sub : marks.keySet()){
            Map<String,Integer> m = marks.get(sub);

            String topper = Collections.max(m.entrySet(), Map.Entry.comparingByValue()).getKey();
            System.out.println("Topper in " + sub + " = " + topper);
        }

        for(String sub : marks.keySet()){
            Map<String,Integer> m = marks.get(sub);
            double avg = m.values().stream().mapToInt(i->i).average().orElse(0);
            System.out.println("Average in " + sub + " = " + avg);
        }

        System.out.println("Subjects with score > 90:");
        for(String sub : marks.keySet()){
            for(int val : marks.get(sub).values()){
                if(val > 90){
                    System.out.println(sub);
                    break;
                }
            }
        }
    }
}

