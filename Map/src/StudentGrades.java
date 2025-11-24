import java.util.*;

public class StudentGrades {
    public static void main(String[] args) {
        Map<String, Double> grades = new TreeMap<>(); // auto-sorted keys

        grades.put("Alice", 88.0);
        grades.put("Bob", 75.5);
        grades.put("Carol", 92.0);

        grades.put("Bob", 80.0);

        grades.remove("Carol");

        for(String name : grades.keySet()){
            System.out.println(name + " = " + grades.get(name));
        }
    }
}

