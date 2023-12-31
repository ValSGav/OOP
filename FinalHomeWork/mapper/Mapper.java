package FinalHomeWork.mapper;

import java.util.ArrayList;
import java.util.regex.Pattern;

public class Mapper {

    public static String[] getArrayOfOperation() {
        return new String[]{"+", "-", "*", "/"};
    }
    public static ArrayList<String> getArrayOfOperationAndValues(String[] arrayOfOperation, int indexOfOperation, String expression) {

        System.out.println(expression);

        ArrayList<String> returnArray = new ArrayList<String>();

        // если индекс текущей сплитующей операции больше чем всего сплитующих операций в массиве,
        //возвращаем массив с тем, что пришло для сплита
        if (indexOfOperation + 1 > arrayOfOperation.length) {
            returnArray.add(expression);
            return returnArray;
        }


        // массив строк, получившихся после сплита текущей сплитующей операцией
        final String re = Pattern.quote(arrayOfOperation[indexOfOperation]);
        String[] arrayOfComponent = expression.split(re);


        //если ничего не сплитанули, то возвращем массив с тем, что пришло для сплита
        if (arrayOfComponent.length == 1){
            returnArray.add(arrayOfComponent[0]);
            return returnArray;
        }

        for (String component : arrayOfComponent) {
            //для каждого элемента после сплита пытаемся разбивать дальше, следующей сплитующей операцией
            ArrayList<String> newComponent = getArrayOfOperationAndValues(arrayOfOperation, indexOfOperation + 1, component);
            //запихиваем в массив строк для возврата все что сплитанули
            for (String newComponentString : newComponent) {
                returnArray.add(newComponentString);

            }
            returnArray.add(String.valueOf(arrayOfOperation[indexOfOperation]));
        }
        returnArray.remove(returnArray.size() - 1);

        return returnArray;
    }
}
