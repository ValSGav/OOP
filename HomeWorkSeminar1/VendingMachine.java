package HomeWorkSeminar1;

import java.util.Random;

public class VendingMachine {

    protected static Random rd;
    protected int id;
    protected String locationAddress;

    static{
        VendingMachine.rd = new Random(10000000);
    }
    
    
    public VendingMachine(int id, String locationAddress){
        this.id = id;
        this.locationAddress = locationAddress;
    }

    public VendingMachine(int id){
        this(id, "");
    }

    public VendingMachine(){
        this(VendingMachine.rd.nextInt(), "");
    }
        
    public int getId() {
        return id;
    }

    public String getLocationAddress() {
        return locationAddress;
    }

    public void setLocationAddress(String locationAddress) {
        this.locationAddress = locationAddress;
    }

    public Drinks getProduct(){
        return new Drinks();
    }
    
}
