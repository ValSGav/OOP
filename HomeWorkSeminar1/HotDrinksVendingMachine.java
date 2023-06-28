package HomeWorkSeminar1;

public class HotDrinksVendingMachine extends VendingMachine{

    public Drinks getProduct(String name, int volume, int temperature) {
        
        return new HotDrinks(name, volume, temperature);
    }
    
}
