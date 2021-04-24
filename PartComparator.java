package collections;

import java.util.Comparator;

public class PartComparator implements Comparator<Part> {

    @Override
    public int compare(Part one, Part another) {
        return one.getBrand().compareTo(another.getBrand());
    }
}
