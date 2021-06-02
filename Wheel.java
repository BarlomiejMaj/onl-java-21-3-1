package immutabilityTask;

import java.util.*;

public class Wheel  {
    private int radius;
    private int width;

    public Wheel(int radius, int width) {
        this.radius = radius;
        this.width = width;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    @Override
    public String toString() {
        return "Wheel{" +
                "radius=" + radius +
                ", width=" + width +
                '}';
    }

//    @Override
//    public int size() {
//        return 0;
//    }
//
//    @Override
//    public boolean isEmpty() {
//        return false;
//    }
//
//    @Override
//    public boolean contains(Object o) {
//        return false;
//    }
//
//    @Override
//    public Iterator<Wheel> iterator() {
//        return null;
//    }
//
//    @Override
//    public Object[] toArray() {
//        return new Object[0];
//    }
//
//    @Override
//    public <T> T[] toArray(T[] a) {
//        return null;
//    }
//
//    @Override
//    public boolean add(Wheel wheel) {
//        return false;
//    }
//
//    @Override
//    public boolean remove(Object o) {
//        return false;
//    }
//
//    @Override
//    public boolean containsAll(Collection<?> c) {
//        return false;
//    }
//
//    @Override
//    public boolean addAll(Collection<? extends Wheel> c) {
//        return false;
//    }
//
//    @Override
//    public boolean addAll(int index, Collection<? extends Wheel> c) {
//        return false;
//    }
//
//    @Override
//    public boolean removeAll(Collection<?> c) {
//        return false;
//    }
//
//    @Override
//    public boolean retainAll(Collection<?> c) {
//        return false;
//    }
//
//    @Override
//    public void clear() {
//
//    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Wheel wheel = (Wheel) o;
        return radius == wheel.radius && width == wheel.width;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), radius, width);
    }

//    @Override
//    public Wheel get(int index) {
//        return null;
//    }
//
//    @Override
//    public Wheel set(int index, Wheel element) {
//        return null;
//    }
//
//    @Override
//    public void add(int index, Wheel element) {
//
//    }
//
//    @Override
//    public Wheel remove(int index) {
//        return null;
//    }
//
//    @Override
//    public int indexOf(Object o) {
//        return 0;
//    }
//
//    @Override
//    public int lastIndexOf(Object o) {
//        return 0;
//    }
//
//    @Override
//    public ListIterator<Wheel> listIterator() {
//        return null;
//    }
//
//    @Override
//    public ListIterator<Wheel> listIterator(int index) {
//        return null;
//    }
//
//    @Override
//    public List<Wheel> subList(int fromIndex, int toIndex) {
//        return null;
//    }
}
