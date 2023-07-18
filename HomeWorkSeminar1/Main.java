package HomeWorkSeminar1;

public class Main {

    public static void main(String[] args) {

        int numbOfVendingMachines = 4;

        VendingMachine[] VendingMachines = new VendingMachine[numbOfVendingMachines];

        HotDrinks coffe = new HotDrinks("cofee", 50, 90);
        HotDrinks tea = new HotDrinks("tea", 300, 70);
        Donats cabbagePie = new Donats("pie", "cabbage");
        Donats meatPie = new Donats("pie", "meet");

        for (int i = 0; i < VendingMachines.length; i++) {
            VendingMachines[i] = new DonatsAndHotDrinksVendingMachine();
            VendingMachines[i].setLocationAddress(String.format("Помещение № %d", i));
        }

        System.out.println(VendingMachines[0].setCurrentProduct(coffe));
        System.out.println(VendingMachines[0].addSugar());
        System.out.println(VendingMachines[0].getProduct());
        System.out.println();

        System.out.println(VendingMachines[1].setCurrentProduct(meatPie));
        System.out.println(VendingMachines[1].addSugar());
        System.out.println(VendingMachines[1].getProduct());
        System.out.println();

        System.out.println(VendingMachines[2].setCurrentProduct(tea));
        System.out.println(VendingMachines[2].getProduct());
        System.out.println();

        System.out.println(VendingMachines[3].setCurrentProduct(cabbagePie));
        System.out.println(VendingMachines[3].addSugar());
        System.out.println(VendingMachines[3].getProduct());
        System.out.println();

    }

}
