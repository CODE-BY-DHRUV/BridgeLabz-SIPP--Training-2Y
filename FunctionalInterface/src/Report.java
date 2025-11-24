interface Exportable{
    void exportToCSV();
    void exportToPDF();
    default void exportToJSON() {
        System.out.println("Exporting to JSON (default support added).");
    }
}

class Report implements Exportable {
    public void exportToCSV() { System.out.println("Exported report to CSV."); }
    public void exportToPDF() { System.out.println("Exported report to PDF."); }
}

public class ExportDemo {
    public static void main(String[] args) {
        Report r = new Report();
        r.exportToCSV();
        r.exportToJSON(); // uses default
    }
}

