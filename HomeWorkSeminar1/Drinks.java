package HomeWorkSeminar1;

public class Drinks {

    protected String name;
    protected int volume;

    public Drinks(String name, int volume){
        this.name = name;
        this.volume = volume;
    }

    public Drinks(){
        this("unknown", 0);        
    }

    public String getName() {
        return name;
    }

    public int getVolume() {
        return volume;
    }
    
}