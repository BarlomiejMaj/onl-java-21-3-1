package inheritance;

public class Car extends Transport{

   // @Override
    public void go() {
        System.out.println("Car is moving not so fast");
    }

    @Override
    protected void makeSound() {
        System.out.println("Car noise is not tiring");
    }

    @Override
    protected void beep() {
        System.out.println("Car have a horn");
    }

    @Override
    protected void capacity() {
        System.out.println("Capacity depends of car");
    }

    @Override
    protected void travelTime() {
        System.out.println("Average time spend on traveling by car");
    }
}
