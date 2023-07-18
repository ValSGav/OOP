package Seminar6.src.lsp2.model;

public class Order extends Orderable{

    public Order(int quantity, int price) {
        super(quantity, price);
    }

    public int getAmount() {
        return quantity * price;
    }

    @Override
    public String toString() {
        return String.format("Quantity = %d, Price = %d", quantity, price);
    }
}
