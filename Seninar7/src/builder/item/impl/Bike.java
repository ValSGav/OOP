package Seninar7.src.builder.item.impl;

import Seninar7.src.builder.item.Characteristic;
import Seninar7.src.builder.item.Item;

public class Bike implements Item {
    private final Characteristic characteristic;

    public Bike(Characteristic characteristic) {
        this.characteristic = characteristic;
    }

    @Override
    public Characteristic getCharacteristic() {
        return characteristic;
    }
}
