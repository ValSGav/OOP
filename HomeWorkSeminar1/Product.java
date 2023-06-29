package HomeWorkSeminar1;

public class Product {

    protected String name;
    private boolean withSugar;
    
    public Product(String name){
        this.name = name;
        withSugar = false;        
    }

    public Product(){
        this("unknown");        
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return String.format("%s%s", this.name, withSugar? " with sugar": "");
    }

    public void putSugar() {
        withSugar = true;
    }
    
}