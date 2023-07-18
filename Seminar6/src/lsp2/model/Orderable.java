package Seminar6.src.lsp2.model;

public abstract class Orderable {

    protected final int price;
    protected final int quantity;

    protected Orderable(int price, int quantity) {
        this.price = price;
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return String.format("Quantity = %d, Price = %d it's bonus", this.price, this.quantity);
    }

    public abstract int getAmount();
}
