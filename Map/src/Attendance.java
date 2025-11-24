import java.util.*;

public class Attendance {
    public static void main(String[] args) {
        List<String> students = List.of("A","B","C","D","E");
        Map<String, Integer> present = new HashMap<>();

        for(String s : students) present.put(s, 0);

        Random r = new Random();

        for(int day=1; day<=15; day++){
            for(String s : students){
                if(r.nextBoolean()) present.put(s, present.get(s)+1);
            }
        }

        System.out.println("Under-attending (<10):");
        for(String s : students){
            if(present.get(s) < 10) System.out.println(s);
        }
    }
}
