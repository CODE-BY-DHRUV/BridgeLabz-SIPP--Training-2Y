import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

interface DateFormatter {
    static String formatDate(LocalDate date, String pattern) {
        return date.format(DateTimeFormatter.ofPattern(pattern));
    }
}

 class DateFormatterDemo{
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        System.out.println("ISO: " + DateFormatter.formatDate(today, "yyyy-MM-dd"));
        System.out.println("Fancy: " + DateFormatter.formatDate(today, "dd MMM yyyy"));
    }
}
