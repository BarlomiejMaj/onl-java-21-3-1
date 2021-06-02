package immutabilityTask;

import lombok.EqualsAndHashCode;
import lombok.ToString;

import java.util.List;

@ToString
@EqualsAndHashCode
public class Car {
    private final String manufacturer;
    private final String model;
    private final Engine engine;
   // private final List<Wheel> wheels;

    public Car(String manufacturer, String model, Engine engine) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.engine = engineCopy(engine);
        //this.wheels = (List<Wheel>) wheelsCopy((Wheel) wheels);
    }

    public static Car createCar(String manufacturer, String model, Engine engine) {
        return new Car(manufacturer, model, engine);
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getModel() {
        return model;
    }

    public Engine getEngine() {
        return engineCopy(engine);
    }

    private Engine engineCopy(Engine engineToCopy){
        return new Engine(engineToCopy.getType(), engineToCopy.getHorsePower(), engineToCopy.getVolume());
    }

//    public Wheel getWheels() {
//        return wheelsCopy((Wheel) wheels);
//    }
//
//    private Wheel wheelsCopy(Wheel wheelsToCopy){
//        return new Wheel(wheelsToCopy.getRadius(), wheelsToCopy.getWidth());
//    }
}
