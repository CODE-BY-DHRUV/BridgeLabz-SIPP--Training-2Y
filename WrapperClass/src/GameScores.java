public class GameScores {
    public static void main(String[] args) {

        Integer[] scores = {10, null, 30, null, 20};

        int notPlayed = 0, total = 0;

        for (Integer s : scores) {
            if (s == null) notPlayed++;
            else total += s;  // auto-unboxing
        }

        System.out.println("Players not played = " + notPlayed);
        System.out.println("Total score = " + total);
    }
}
