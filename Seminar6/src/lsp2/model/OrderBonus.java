package Seminar6.src.lsp2.model;

public class OrderBonus extends Orderable {

    public OrderBonus(int quantity, int price) {
        super(quantity, price);
    }

    @Override
    public int getAmount() {
        return 0;
    }
}
