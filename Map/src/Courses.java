import java.util.*;

public class Courses {
    public static void main(String[] args) {
        Map<String, Integer> reg = new HashMap<>();

        reg.put("CS101", 48);
        reg.put("CS102", 10);
        reg.put("MA101", 3);
        reg.put("PH101", 55);
        reg.put("EE101", 60);

        reg.put("MA101", reg.get("MA101") + 2);
        reg.put("CS102", reg.get("CS102") - 5);
        if(reg.get("CS102") < 0) reg.put("CS102", 0);

        System.out.println("Near full:");
        for(String c : reg.keySet())
            if(reg.get(c) >= 50) System.out.println(c);

        System.out.println("Under-subscribed:");
        for(String c : reg.keySet())
            if(reg.get(c) < 5) System.out.println(c);
    }
}

