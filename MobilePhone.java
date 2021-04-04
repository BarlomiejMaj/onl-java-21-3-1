package objects;

public class MobilePhone {

    String brand;
    String model;
    int batteryCapacity;
    int batteryAmount;
    int memory;
    int freeMemory;
    int hours;

    public MobilePhone(String brand, int batteryCapacity, int memory ){
        this.brand = brand;
        this.batteryCapacity = batteryCapacity;
        this.memory = memory;
        this.batteryAmount = hours * 100;

    }

    public void installApplication(String appName, int appMemory) {
        if (this.memory >= appMemory) {
            this.memory = memory - appMemory;
            System.out.printf("Application %s has been installed on %s. Remain memory: %s MB %n", appName, this.brand, this.memory);

        } else {
            System.out.printf("Application %s can't be installed on %s. There are no enough memory %n", appName, this.brand);
        }
    }


    public void use(String appName, int hours) {
        if (this.batteryCapacity >= hours * 100) {
            this.batteryCapacity = batteryCapacity - hours * 100;
            System.out.printf("Application %s has been ran for %s hours on %s. Remain battery capacity: %s mAh %n", appName, hours, this.brand, this.batteryCapacity);
       // } else if (this.batteryCapacity == 0 ){
       //     System.out.printf("Application %s can't be run on %s. Phone discharged %n", appName, this.brand);
        } else {
            this.batteryCapacity = batteryCapacity - hours * 100;
            System.out.printf("Application %s has been used for %s hours on %s. Phone has been discharged. %n", appName, hours, this.brand);
            if (this.batteryCapacity <= 0){
                System.out.printf("Application %s can't be run on %s. Phone discharged %n", appName, this.brand);
            }
        }
    }


    public void charge(){
        this.batteryCapacity = 1000;
        System.out.printf("%s has been charged. Remain battery capacity: %s mAh %n", this.brand, this.batteryCapacity);
    }
}
