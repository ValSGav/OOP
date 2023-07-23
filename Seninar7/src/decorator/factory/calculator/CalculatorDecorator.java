package Seninar7.src.decorator.factory.calculator;

import Seninar7.src.decorator.log.Logger;

public class CalculatorDecorator implements Calculable{

    Calculator component;

    private Logger logger;

    public CalculatorDecorator(Calculator component, Logger logger) {
        this.component = component;
        this.logger = logger;
    }

    @Override
    public Calculable sum(int arg) {
        logger.log(String.format("��������� %s � %s", arg, component.getResult()));
        Calculable result = component.sum(arg);
        logger.log(String.format("��������� %d", result.getResult()));
        return this;
    }

    @Override
    public Calculable multi(int arg) {
        logger.log(String.format("�������� %s �� %s", arg, component.getResult()));
        Calculable result = component.multi(arg);
        logger.log(String.format("��������� %d", result.getResult()));
        return this;
    }

    @Override
    public int getResult() {
        return component.getResult();
    }
}
