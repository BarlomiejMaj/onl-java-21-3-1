package comparingObjects;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Catalogue {
    public static void main(String[] args) {

        List<Item> itemList = new ArrayList<>();
        itemList.add(new Item("T-shirt", 49));
        itemList.add(new Item("Trousers", 199));
        itemList.add(new Item("Jacket", 249));
        itemList.add(new Item("Shoes", 199));
        itemList.add(new Item("Socks", 21));
        itemList.add(new Item("Hoodie", 189));
        itemList.add(new Item("Hat", 79));
        itemList.add(new Item("High heels", 179));
        itemList.add(new Item("Sunglasses", 129));


        itemList.sort(new ItemNameComparator());
        System.out.println("Sorted by name:");
        System.out.println(itemList);

        itemList.sort(new ItemNameComparator().reversed());
        System.out.println("Sorted by name in reverse order:");
        System.out.println(itemList);

        itemList.sort(Comparator.naturalOrder());
        System.out.println("From the cheapest to the most expensive:");
        System.out.println(itemList);

        itemList.sort(Comparator.reverseOrder());
        System.out.println("From the most expensive to the cheapest:");
        System.out.println(itemList);


    }
}
