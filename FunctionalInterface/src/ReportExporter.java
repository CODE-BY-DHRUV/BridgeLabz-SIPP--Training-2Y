interface ReportExporter {
    void exportCSV();
    void exportPDF();

    default void exportToJSON() {
        System.out.println("JSON export not supported — using default implementation.");
    }
}

class CSVExporter implements ReportExporter {
    public void exportCSV() { System.out.println("Exporting CSV..."); }
    public void exportPDF() { System.out.println("Exporting PDF..."); }
}
