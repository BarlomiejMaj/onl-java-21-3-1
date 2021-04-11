package objects;

public class MobilePhone {

    String brand;
    String model;
    int batteryCapacity;
    int batteryAmount;
    int memory;
    int freeMemory;


    public MobilePhone(String brand, int batteryCapacity, int memory ){
        this.brand = brand;
        this.batteryCapacity = batteryCapacity;
        this.memory = memory;
        this.batteryAmount = batteryCapacity;


    }

    public void installApplication(String appName, int appMemory) {
        if (memory >= appMemory) {
            memory = memory - appMemory;
            System.out.printf("Application %s has been installed on %s. Remain memory: %s MB %n", appName, brand, memory);

        } else {
            System.out.printf("Application %s can't be installed on %s. There are no enough memory %n", appName, brand);
        }
    }


    public void use(String appName, int hours) {
       if(batteryAmount > 0){
            int discharge = hours * 100;
            if (batteryAmount - discharge > 0) {
                batteryAmount = batteryAmount - discharge;
                System.out.printf("Application %s has been ran for %s hours on %s. Remain battery capacity: %s mAh %n", appName, hours, brand, batteryAmount);

            } else {
                batteryAmount = batteryAmount - discharge;
                System.out.printf("Application %s has been used for %s hours on %s. Phone has been discharged. %n", appName, hours, brand);
            }
       } else {
           System.out.printf("Application %s can't be run on %s. Phone discharged %n", appName, brand);
       }
    }



    public void charge(){
        batteryAmount = batteryCapacity;
        System.out.printf("%s has been charged. Remain battery capacity: %s mAh %n", brand, batteryAmount);
    }
}
