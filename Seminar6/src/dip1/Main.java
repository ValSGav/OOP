package Seminar6.src.dip1;

import Seminar6.src.dip1.model.Report;
import Seminar6.src.dip1.model.ReportManager;
import Seminar6.src.dip1.model.util.ConsolePrinter;
import Seminar6.src.dip1.model.util.ReportPrinter;
import Seminar6.src.logger.Log;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {
    private static final Logger log = Log.log(Main.class.getName());

    public static void main(String[] args) {
        log.log(Level.INFO, "Method main in model package started");
        Report report = new Report();
        report.calculate();
        ReportManager manager = new ReportManager(new ReportPrinter());
        manager.output(report.getItems());
        manager.setPrinter(new ConsolePrinter());
        manager.output(report.getItems());
    }
}
