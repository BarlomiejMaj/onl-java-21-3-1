package inheritance;

public class Train extends PublicTransport{

    @Override
    protected void ticket() {
        System.out.println("In train ticket is needed");
    }

    @Override
    protected void driverLicense() {
        System.out.println("In train you don't need a driver license");
    }

    //@Override
    public void go() {
        System.out.println("Train is moving");
    }

    @Override
    protected void makeSound() {
        System.out.println("Train is quite silent");
    }

    @Override
    protected void beep() {
        System.out.println("Train have a noisy horn");
    }

    @Override
    protected void capacity() {
        System.out.println("Train is very capacious");
    }

    @Override
    protected void travelTime() {
        System.out.println("Traveling by train take average amount of time");
    }
}
