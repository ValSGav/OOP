package Seninar7.src.decorator.factory.calculator;

// Создать логирование операций, для класса Calculator. Класс Calculator не должен изменится.
public class Main {
    public static void main(String[] args) {
        //ICalculableFactory calculableFactory = new CalculableFactory();
        ICalculableFactory calculableFactory = new CalculatorDecoratorFactory();
        CalculatorView view = new CalculatorView(calculableFactory);
        view.run();
    }
}
