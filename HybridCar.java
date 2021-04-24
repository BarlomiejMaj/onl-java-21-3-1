package interfaces;

public class HybridCar extends Car implements Tankable, Chargable{


    public HybridCar(String manufacturer, String model) {
        super(manufacturer, model);
    }

    @Override
    public String charge() {
        System.out.println("I can be charged");
        return null;
    }

    @Override
    public void tank() {
        System.out.println("I can be tanked");
    }
}
