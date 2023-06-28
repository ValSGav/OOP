package HomeWorkSeminar1;

public class HotDrinks extends Drinks{

    int temperature;    

    public HotDrinks(String name, int volume, int temperature){
        super(name, volume);
        this.temperature = temperature;
    }

    public int getTemperature() {
        return temperature;        
    }
    
}
