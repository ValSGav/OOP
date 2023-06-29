package HomeWorkSeminar1;

import java.util.Random;

public class VendingMachine {

    protected static Random rd;
    protected int id;
    protected String locationAddress;

    protected Product currentProduct;

    static {
        VendingMachine.rd = new Random();
    }

    public VendingMachine(int id, String locationAddress) {
        this.id = id;
        this.locationAddress = locationAddress;
    }

    public VendingMachine(int id) {
        this(id, "");
    }

    public VendingMachine() {
        this(VendingMachine.rd.nextInt(100000000), "unknown");
    }

    public int getId() {
        return id;
    }

    public String getLocationAddress() {
        return locationAddress;
    }

    public void setLocationAddress(String locationAddress) {
        this.locationAddress = locationAddress;
    }

    public String getProduct() {
        if (currentProduct == null)
            return "Не выбран текущий продут";
        return String.format("%s, Заберите: %s", this.toString(), currentProduct.toString());
    }

    public String addSugar() {
        String returnString = String.format("%s: Добавлен сахар в %s", this.toString(), currentProduct.toString());
        currentProduct.putSugar();
        return returnString;
    }

    public String setCurrentProduct(Product currentProduct) {
        this.currentProduct = currentProduct;
        return String.format("%s: Выбран продукт %s", this.toString(), currentProduct.toString());
    }

    @Override
    public String toString() {

        return String.format("Автомат номер %d, расположенный в %s", this.id, this.locationAddress);
    }

}
