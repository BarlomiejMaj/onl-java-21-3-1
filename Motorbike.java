package inheritance;

public class Motorbike extends Transport{

    //@Override
    public void go() {
        System.out.println("Motorbike can drive very fast.");
    }

    @Override
    protected void makeSound() {
        System.out.println("Motorbike is loud.");
    }

    @Override
    protected void beep() {
        System.out.println("Motorbike have a horn");
    }

    @Override
    protected void capacity() {
        System.out.println("Motorbike can transport only 2 people");
    }

    @Override
    protected void travelTime() {
        System.out.println("Traveling on a motorbike does not take so much time");
    }
}
