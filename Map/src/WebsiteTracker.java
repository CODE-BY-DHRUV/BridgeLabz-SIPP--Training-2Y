import java.util.*;

public class WebsiteTracker {
    public static void main(String[] args) {
        Map<String, Integer> visits = new HashMap<>();

        String[] pages = {"home","about","products","home","products","contact","home"};

        for(String p : pages)
            visits.put(p, visits.getOrDefault(p, 0) + 1);

        visits.entrySet().stream()
                .sorted((a,b)->b.getValue()-a.getValue())
                .forEach(System.out::println);

        String maxPage = Collections.max(visits.entrySet(), Map.Entry.comparingByValue()).getKey();
        System.out.println("Most visited = " + maxPage);
    }
}

