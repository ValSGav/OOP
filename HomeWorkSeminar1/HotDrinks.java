package HomeWorkSeminar1;

public class HotDrinks extends Product {

    protected int temperature;
    protected int volume;

    public HotDrinks(String name, int volume, int temperature) {
        super(name);
        this.volume = volume;
        this.temperature = temperature;
    }

    public int getTemperature() {
        return temperature;
    }

    public int getVolume() {
        return this.volume;
    }

    @Override
    public String toString() {
        return String.format("%s (%d ml.) t°C %d", super.toString(), this.volume, this.temperature);
    }

}
