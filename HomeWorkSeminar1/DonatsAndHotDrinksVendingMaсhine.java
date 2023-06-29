package HomeWorkSeminar1;

public class DonatsAndHotDrinksVendingMaсhine extends VendingMachine {

    @Override
    public String addSugar() {

        String returnString = String.format("%s: Добавляем сахар в %s", this.toString(),
                (currentProduct.toString()));
        String addInfo = "\n\tНе доступно добавление сахара для этого продукта";        
        
        if (currentProduct.getClass() == HotDrinks.class){
            addInfo = "";        
            currentProduct.putSugar();
        }

        return String.join("", returnString, addInfo);
    }
}
