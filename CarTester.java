package interfaces;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class CarTester {

    public static void main(String[] args) {
        Car maserati = new Car("Maserati", "Ghibli");
        Car fiat = new Car("Fiat", "125P");
        Car mercedes = new Car ("Mercedes", "W204");
        Car toyota = new Car("Toyota", "Prius");
        Car nissan = new Car("Nissan", "Leaf");


        //List<Car> cars = List.of(maserati, fiat, mercedes, toyota, nissan);
        List<Car> cars = Arrays.asList(maserati, fiat, mercedes, toyota, nissan);

        System.out.println(cars);


        int n = cars.size();
        for (int i = 0; i < cars.size(); i++){
            System.out.println(cars.get(i) + " ");
            }

        System.out.println(maserati == maserati);
        System.out.println(fiat.equals(maserati));
        System.out.println(nissan.hashCode() == fiat.hashCode());

        System.out.println(mercedes.getManufacturer());

        FuelCar car = new FuelCar("Mercedes", "W204");

        ElectricCar car1 = new ElectricCar("Nissan", "Leaf");

        HybridCar car2 = new HybridCar("Toyota", "Prius");

        System.out.println(car.getModel());
        System.out.println(car1.getManufacturer());
        System.out.println(car2.charge());







//        List<Car> cars = new ArrayList<>();
//        cars.add(new Car("Maserati", "Ghibli"));
//        cars.add(new Car("Fiat", "125P"));
//        cars.add(new Car("Mercedes", "W204"));
//        cars.add(new Car("Toyota", "Prius"));
//        cars.add(new Car("Nissan", "Leaf"));
//
//        System.out.println(cars);

    }
 }
