package Seminar6.src.dip1.model.util;

import Seminar6.src.dip1.model.ReportItem;
import Seminar6.src.dip1.model.Reportable;

import java.util.List;

public class ConsolePrinter implements Reportable {
    public void output(List<ReportItem> items) {
        System.out.println("Output to console");
        for (ReportItem item : items) {
            System.err.format("console %s - %f \n\r", item.getDescription(), item.getAmount());
        }
    }
}
