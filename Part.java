package collections;

import comparingObjects.Item;

import java.util.Objects;

public class Part implements Comparable<Part>{
    private int partNumber;
    private String brand;
    private String name;

    public Part(int partNumber, String brand, String name) {
        this.partNumber = partNumber;
        this.brand = brand;
        this.name = name;
    }

    public int getPartNumber() {
        return partNumber;
    }

    public String getBrand() {
        return brand;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "ID='" + partNumber + '\'' +
                ", brand=" + brand + '\'' +
                ", name=" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public int hashCode() {
        return Objects.hash(partNumber, brand, name);
    }

    @Override
    public int compareTo(Part anotherPart) {
        return this.partNumber - anotherPart.partNumber;
    }
}
