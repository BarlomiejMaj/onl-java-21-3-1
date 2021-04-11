package inheritance;

public abstract class PublicTransport extends Transport{

    protected abstract void ticket();
    protected abstract void driverLicense();


    //@Override
    public void go() {
        System.out.println("Public transport is offer transport of passengers");
    }

    @Override
    protected void makeSound() {
        System.out.println("Public transport is noisy");
    }

    @Override
    protected void beep() {
        System.out.println("Beep! Beep!");
    }

    @Override
    protected void capacity() {
        System.out.println("Public transport can move a lot of people");
    }

    @Override
    protected void travelTime() {
        System.out.println("Public transport travel time depends of vehicle");
    }
}
