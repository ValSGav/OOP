package HomeWorkSeminar1;

public class Donats extends Product{
    String filling;

    public Donats(String name, String filling){
        super(name);
        this.filling = filling;
    }

    @Override
    public String toString() {        
        return String.format("%s(%s)", super.toString(), this.filling);
    }    

    public String getFilling() {
        return filling;
    }


}
