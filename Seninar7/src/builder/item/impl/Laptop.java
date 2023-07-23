package Seninar7.src.builder.item.impl;

import Seninar7.src.builder.item.Characteristic;
import Seninar7.src.builder.item.Item;

public class Laptop implements Item {
    private final Characteristic characteristic;

    public Laptop(Characteristic characteristic) {
        this.characteristic = characteristic;
    }

    @Override
    public Characteristic getCharacteristic() {
        return characteristic;
    }
}
