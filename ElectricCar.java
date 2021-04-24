package interfaces;

public class ElectricCar extends Car implements Chargable{


    public ElectricCar(String manufacturer, String model) {
        super(manufacturer, model);
    }

    @Override
    public String charge() {
        System.out.println("I can be only charged");
        return null;
    }
}
