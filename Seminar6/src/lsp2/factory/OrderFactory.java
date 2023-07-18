package Seminar6.src.lsp2.factory;

import Seminar6.src.lsp2.model.Order;
import Seminar6.src.lsp2.model.OrderBonus;
import Seminar6.src.lsp2.model.Orderable;

public class OrderFactory {
    public Orderable create(int quantity, int price, boolean isBonus) {
        if (isBonus) {
            return new OrderBonus(quantity, price);
        }
        return new Order(quantity, price);
    }
}
