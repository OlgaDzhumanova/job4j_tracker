package inheritance;

import inheritance.HtmlReport;
import inheritance.JSONReport;

public class ReportUsage {
    public static void main(String[] args) {
        HtmlReport report = new HtmlReport();
        String text = report.generate("Report's name", "Report's body");
        System.out.println(text);

        JSONReport jsonReport = new JSONReport();
        String textTwo = jsonReport.generate("name", "body");
        System.out.println(textTwo);
    }
}