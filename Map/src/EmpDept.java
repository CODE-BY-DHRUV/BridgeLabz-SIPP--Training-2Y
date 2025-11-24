import java.util.*;

public class EmpDept {
    public static void main(String[] args) {
        Map<Integer, String> emp = new HashMap<>();

        emp.put(1,"HR");
        emp.put(2,"IT");
        emp.put(3,"Sales");
        emp.put(4,"IT");
        emp.put(5,"HR");

        emp.put(3, "IT");

        String search = "IT";
        System.out.println("Employees in IT:");
        for(int id : emp.keySet())
            if(emp.get(id).equals(search))
                System.out.println(id);

        Map<String, Integer> count = new HashMap<>();
        for(String d : emp.values())
            count.put(d, count.getOrDefault(d, 0) + 1);

        System.out.println(count);
    }
}

