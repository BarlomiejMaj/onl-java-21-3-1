package comparingObjects;

import java.util.Objects;

public class Item  implements Comparable<Item>{
    private String name;
    private int price;


    public Item(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public Item() {
        super();
    }

    @Override
    public String toString() {
        return "Item{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Item item = (Item) o;
        return price == item.price && Objects.equals(name, item.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price);
    }

    @Override
    public int compareTo(Item anotherItem) {
        return this.price - anotherItem.price;
    }

}
