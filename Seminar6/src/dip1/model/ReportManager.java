package Seminar6.src.dip1.model;

import java.util.List;

public class ReportManager {

    Reportable reportable;

    public ReportManager(Reportable reportable){
        this.reportable = reportable;
    }

    public void output(List<ReportItem> reportItems){
            reportable.output(reportItems);
    }

    public void setPrinter(Reportable printer) {
        this.reportable = printer;
    }
}
