import java.util.*;

public class Countries {
    public static void main(String[] args) {
        Map<String, String> map = new TreeMap<>();

        map.put("India","Delhi");
        map.put("USA","Washington");
        map.put("UK","London");
        map.put("Japan","Tokyo");
        map.put("France","Paris");
        map.put("China","Beijing");
        map.put("Germany","Berlin");
        map.put("Italy","Rome");

        System.out.println(map.getOrDefault("Japan","Unknown country"));

        for(String c : map.keySet())
            System.out.println(c + " -> " + map.get(c));
    }
}

