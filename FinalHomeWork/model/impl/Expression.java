package FinalHomeWork.model.impl;

import FinalHomeWork.model.Componentable;
import FinalHomeWork.model.Operationable;
import FinalHomeWork.model.Valueable;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Expression implements Componentable, Valueable {
    private List<Componentable> listOfComponents;

    public Expression() {
        this.listOfComponents = new LinkedList<Componentable>();
    }

    private void ranking() {
        boolean done = false;
        int maxRank = 0;
        int minRank = 0;
        int currentRank = 1;
        while (!done) {
            done = true;
            //ищем максимальный и минимальный ранг операций
            for (Componentable item : listOfComponents
            ) {
                currentRank = item.getRank();
                if (minRank == 0) {
                    maxRank = currentRank;
                    minRank = currentRank;
                } else if (currentRank > maxRank) {
                    maxRank = currentRank;
                } else if (currentRank > 0 && currentRank < minRank) {
                    minRank = currentRank;
                }
                ;
            }
            //если все операции одноранговые, то ничего делать не надо,
            //расчет в getValue можно будет проводить слева направо, по порядку
            //иначе для более приоритетных операций будем создавать Expression
            if (maxRank != minRank) {
                Iterator<Componentable> iteratorOfComponentsList = listOfComponents.iterator();
                while (iteratorOfComponentsList.hasNext() && done) {
                    Componentable currentItem = iteratorOfComponentsList.next();
                    if (currentItem.getRank() > minRank) {
                        done = false;
                        Componentable newExpression = new Expression();
                        ((Expression) newExpression).addComponent(listOfComponents.get(listOfComponents.indexOf(currentItem) - 1));
                        ((Expression) newExpression).addComponent(listOfComponents.get(listOfComponents.indexOf(currentItem)));
                        ((Expression) newExpression).addComponent(listOfComponents.get(listOfComponents.indexOf(currentItem) + 1));
                        listOfComponents.set(listOfComponents.indexOf(currentItem) - 1, newExpression);
                        listOfComponents.remove(listOfComponents.indexOf(currentItem) + 1);
                        listOfComponents.remove(listOfComponents.indexOf(currentItem));

                    }
                }
            }
        }
    }

    public void addComponent(Componentable component) {
        this.listOfComponents.add(component);
    }

    public  void clear(){
        this.listOfComponents.clear();
    }

    @Override
    public double getValue() {
        double returnValue = 0.0;
        if (listOfComponents.size() != 0) {
            this.ranking();
            returnValue = ((Valueable)listOfComponents.get(0)).getValue();

            for (Componentable item : listOfComponents
            ) {
                if (item instanceof Operationable){
                    returnValue = ((Operationable) item).calculate(returnValue, ((Valueable)listOfComponents.get(listOfComponents.indexOf(item) + 1)).getValue());
                }
            }
        }
        return returnValue;
    }

    @Override
    public int getRank() {
        return 0;
    }

    @Override
    public String toString() {
        return listOfComponents.toString();
    }
}
