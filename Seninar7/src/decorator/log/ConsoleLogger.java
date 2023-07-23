package Seninar7.src.decorator.log;

import java.time.LocalDateTime;

public class ConsoleLogger implements Logger {
    @Override
    public void log(String any) {
        System.err.printf("%n%s : %s%n", LocalDateTime.now(),any);
    }
}