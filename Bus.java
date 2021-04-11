package inheritance;

public class Bus extends PublicTransport{

    @Override
    protected void ticket() {
        System.out.println("In bus ticket is needed");
    }

    @Override
    protected void driverLicense() {
        System.out.println("In bus you don't need a driver license");
    }

    //@Override
    public void go() {
        System.out.println("Bus is driving");
    }

    @Override
    protected void makeSound() {
        System.out.println("Bus is more noisy than train");
    }

    @Override
    protected void beep() {
        System.out.println("Bus have a horn");
    }

    @Override
    protected void capacity() {
        System.out.println("Bus can take 30 people");
    }

    @Override
    protected void travelTime() {
        System.out.println("Traveling by bus take not much time");
    }
}
