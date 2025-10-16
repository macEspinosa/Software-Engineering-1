public class PowerOutletDemo {
    public static void main(String[] args) {
        Laptop laptop = new Laptop();
        Refrigerator refrigerator = new Refrigerator();
        SmartphoneCharger smartphoneCharger = new SmartphoneCharger();

        PowerOutlet laptopAdapter = new LaptopAdapter(laptop);
        PowerOutlet refrigeratorAdapter = new RefrigeratorAdapter(refrigerator);
        PowerOutlet smartphoneAdapter = new SmartphoneAdapter(smartphoneCharger);

        System.out.println("Plugging devices into power outlets:\n");

        laptopAdapter.plugIn();
        refrigeratorAdapter.plugIn();
        smartphoneAdapter.plugIn();
    }
}
