package inheritance;

public class Bicycle extends Transport{

    //@Override
    public void go() {
        System.out.println("Bicycle is driving by the muscles power");
    }

    @Override
    protected void makeSound() {
        System.out.println("Bicycle is very quite");
    }

    @Override
    protected void beep() {
        System.out.println("Bicycle have only bell");
    }

    @Override
    protected void capacity() {
        System.out.println("Bicycle is one-person vehicle");
    }

    @Override
    protected void travelTime() {
        System.out.println("Traveling by bicycle takes a long time");
    }
}

