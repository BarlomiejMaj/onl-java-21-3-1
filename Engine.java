package objects;

public class Engine {

    private String engineName;
    private int horsepower;
    private int capacity;
    private boolean isStarted;

    public Engine(String engineName, int horsepower, int capacity){
        this.engineName = engineName;
        this.horsepower = horsepower;
        this.capacity = capacity;
        this.isStarted = false;
    }

    public void start(){
        System.out.printf("%s engine has been started %n", engineName);
        isStarted = true;
    }

    public void stop(){
        System.out.printf("%s engine has been stopped %n", engineName);
        isStarted = false;
    }

    public int maxSpeed(){
        return horsepower * 2;
    }

    public double fuelConsumption(int kilometers){
        double liters = capacity / 1000;
        double consumption = liters * 10 * (kilometers / 100.0);
//        return liters * 10 * (kilometers / 100.0);
        return consumption;
    }

    public String getEngineName() {
        return engineName;
    }

    public int getHorsepower() {
        return horsepower;
    }

    public int getCapacity() {
        return capacity;
    }

    public boolean isStarted() {
        return isStarted;
    }
}
