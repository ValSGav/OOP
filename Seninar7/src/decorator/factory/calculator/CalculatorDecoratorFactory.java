package Seninar7.src.decorator.factory.calculator;

import Seninar7.src.decorator.log.ConsoleLogger;

public class CalculatorDecoratorFactory implements ICalculableFactory {
    @Override
    public Calculable create(int primaryArg) {
        return new CalculatorDecorator(new Calculator(primaryArg), new ConsoleLogger());
    }
}