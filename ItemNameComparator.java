package comparingObjects;

import java.util.Comparator;

public class ItemNameComparator implements Comparator<Item> {

    @Override
    public int compare(Item one, Item another) {
        return one.getName().compareTo(another.getName());
    }
}
