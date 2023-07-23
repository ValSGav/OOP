package Seninar7.src.builder;

import Seninar7.src.builder.item.Characteristic;
import Seninar7.src.builder.item.impl.Laptop;

public class Main {
    public static void main(String[] args) {
        Characteristic characteristic = Characteristic.builder()
                .brand("MacBook")
                .ram("123")
                .color("Silver")
                .build();

        Laptop laptop = new Laptop(characteristic);
    }
}
