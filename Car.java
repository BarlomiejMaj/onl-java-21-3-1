package objects;

public class Car {

    String name;
    Engine engine;
    int fuelTankCapacity;
    int remainingFuelAmount;

    public Car(String name, Engine engine, int fuelTankCapacity) {
        this.name = name;
        this.engine = engine;
        this.fuelTankCapacity = fuelTankCapacity;
        this.remainingFuelAmount = fuelTankCapacity;
    }

        public void drive(int speed, int kilometers) {
           if (remainingFuelAmount > 0) {
               int usage = (int) engine.fuelConsumption(kilometers);

               if (this.engine.isStarted() && remainingFuelAmount - usage > 0) {
                   if (speed > engine.maxSpeed()) {
                       speed = engine.maxSpeed();
                   }
                   remainingFuelAmount = remainingFuelAmount - usage;
                   System.out.printf("Car %s has been driven for %s km with speed %s km/h. Remaining fuel: %sL %n", name, kilometers, speed, remainingFuelAmount);
               } else if (this.engine.isStarted() && remainingFuelAmount < 0) {
                   System.out.printf("Car %s has been driven for %s km with speed %s km/h. Tank is empty", name, kilometers, speed);
               } else {
                   System.out.printf("Car %s can't be driven cause engine stopped %n", name);
               }
           } else {
               System.out.printf("Car %s can't be driven. Tank is empty %n", name);
           }
        }

        public void startEngine() {
            if (!engine.isStarted()) {
                System.out.printf("Car %s is starting %s engine %n", name, engine.getEngineName());
                engine.start();
            } else {
                System.out.printf("%s engine has been started already in %s%n", engine.getEngineName(), name);
            }
        }

        public void stopEngine () {
            System.out.printf("Car %s is stopping %s engine %n", name, engine.getEngineName());
            engine.stop();
        }

        public void tank() {
            remainingFuelAmount = fuelTankCapacity;
            System.out.printf("Car %s has been tanked up %n", name);
        }


}





