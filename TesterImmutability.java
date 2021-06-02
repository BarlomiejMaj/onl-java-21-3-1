package immutabilityTask;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TesterImmutability {
    public static void main(String[] args) {
        System.setSecurityManager(new SecurityManager());

        Engine v8 = new Engine("V-angle", 360, 120);
        Engine l6 = new Engine("Inline-six", 250, 98);
        Engine l4 = new Engine("Inline-four", 120, 78);

        Wheel oz = new Wheel(20, 9);
        Wheel bbs = new Wheel(19, 10);
        Wheel enkei = new Wheel(18, 8);

        Car mercedes = Car.createCar("Mercedes", "C63 AMG", v8);
        Car bmw = Car.createCar("BMW", "M340i", l6);
        Car nissan = Car.createCar("Nissan", "350z", l4);


        Map<Car, String> preferredFuel = new HashMap<>();
        preferredFuel.put(mercedes, "Shell-V Power 100");
        preferredFuel.put(bmw, "Verva 98");
        preferredFuel.put(nissan, "Eco 95");

        System.out.println(preferredFuel);

        System.out.printf("Mercedes should be tanked: %s%n", preferredFuel.get(mercedes));
        System.out.printf("BMW should be tanked: %s%n", preferredFuel.get(bmw));
        System.out.printf("Nissan should be tanked: %s%n", preferredFuel.get(nissan));

        Engine mercEngine = mercedes.getEngine();
        mercEngine.setType("l3");
        mercEngine.setHorsePower(200);
        mercEngine.setVolume(12);
        System.out.println(preferredFuel);
        System.out.printf("Mercedes should be tanked: %s%n", preferredFuel.get(mercedes));
        System.out.printf("Mercedes hashCode AFTER changing engine: %d%n", mercedes.hashCode());

        v8.setHorsePower(999);
        System.out.println(preferredFuel);
        System.out.printf("Mercedes should be tanked: %s%n", preferredFuel.get(mercedes));
        System.out.printf("Mercedes hashCode AFTER changing engine: %d%n", mercedes.hashCode());

    }

}
