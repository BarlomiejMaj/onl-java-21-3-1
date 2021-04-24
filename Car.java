package interfaces;

import object.Notebook;

import java.util.Objects;

public class Car {
    public String manufacturer;
    private String model;


    public Car(String manufacturer, String model) {
        this.manufacturer = manufacturer;
        this.model = model;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    @Override
    public String toString() {
        return "Car{" +
                "manufacturer='" + manufacturer + '\'' +
                ", model=" + model +
                '}';
    }

    @Override
    public boolean equals(Object obj){
        if(!(obj instanceof Car)){
            return false;
        }
        Car another = (Car) obj;
        if(!manufacturer.equals(another.manufacturer)){
            return false;
        }
        if(!model.equals(another.model)){
            return false;
        }
        return model == another.model;
    }

    @Override
    public int hashCode() {
        return Objects.hash(manufacturer, model);
    }


}
