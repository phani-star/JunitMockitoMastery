package com.testing.codeCoverage;

public class SalesReportGenerator {
    public String generateReport() {
        DatabaseConnection db = new DatabaseConnection();
        PdfWriter writer = new PdfWriter();
        String data = db.fetchData();
        return writer.write(data);
    }
}

class DatabaseConnection {
    public String fetchData() {
        return "Sales Data";
    }
}

class PdfWriter {
    public String write(String content) {
        return "PDF: " + content;
    }
}
