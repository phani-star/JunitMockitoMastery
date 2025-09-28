package com.testing.codeCoverage;

public class InvoiceReportCreator {
    public String createReport() {
        ApiClient client = new ApiClient();
        HtmlWriter writer = new HtmlWriter();
        String data = client.getData();
        return writer.write(data);
    }
}

class ApiClient {
    public String getData() {
        return "Invoice Data";
    }
}

class HtmlWriter {
    public String write(String content) {
        return "HTML: " + content;
    }
}
