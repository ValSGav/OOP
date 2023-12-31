package FinalHomeWork.controller;

import FinalHomeWork.mapper.Mapper;
import FinalHomeWork.model.impl.Expression;
import FinalHomeWork.model.impl.Operand;
import FinalHomeWork.model.impl.Operations.Div;
import FinalHomeWork.model.impl.Operations.Mult;
import FinalHomeWork.model.impl.Operations.Sub;
import FinalHomeWork.model.impl.Operations.Sum;
import FinalHomeWork.view.View;

import java.util.ArrayList;
import java.util.HashMap;

public class Controller {

    private final Expression expression;

    public View view;

    public Controller(View view) {
        this.view = view;
        expression = new Expression();
    }

    public void setExpression(String stringExpression) {

        expression.clear();

        ArrayList<String> arrayOfOperation = Mapper.getArrayOfOperationAndValues(Mapper.getArrayOfOperation(), 0, stringExpression);

        for (String s : arrayOfOperation
             ) {
            System.out.println(s);
        }

        for (String operation : arrayOfOperation
        ) {
            System.out.println(operation);
            switch (operation) {
                case "/" -> {
                    expression.addComponent(new Div());
                }
                case "*" -> {
                    expression.addComponent(new Mult());
                }
                case "+" -> {
                    expression.addComponent(new Sum());
                }
                case "-" -> {
                    expression.addComponent(new Sub());
                }
                default -> {
                    expression.addComponent(new Operand(Double.parseDouble(operation)));
                }
            }
        }
    }

    public double getResultOfExpression(){
        return expression.getValue();
    }

    public void run(){
        Character answer = ' ';
        do{
            answer = view.showMenu(getMenu());
            switch (answer){
                case '1'-> setExpression(view.getExpression());
                case '2' -> view.showMessage(String.valueOf(getResultOfExpression()));
                case '3' -> view.showMessage("Exit");
                default -> view.showMessage("Error");
            }
        } while (answer != '3');

    }

    private HashMap<Character, String> getMenu() {
        HashMap<Character, String> menu = new HashMap<>();
        menu.put('1', ". - Enter expression");
        menu.put('2', ". - Get result");
        menu.put('3', ". - Exit");
        return menu;
    }


}
