package inheritance;

public class Airplane extends PublicTransport{

    @Override
    protected void ticket() {
        System.out.println("In airplane you need a ticket");
    }

    @Override
    protected void driverLicense() {
        System.out.println("Flying license is very expensive");
    }

   // @Override
    public void go() {
        System.out.println("Airplane is flying");
    }

    @Override
    protected void makeSound() {
        System.out.println("Airplane is VERY loud!");
    }

    @Override
    protected void beep() {
        System.out.println("Airplane does not have a horn");
    }

    @Override
    protected void capacity() {
        System.out.println("Airplane is kind of public transport");
    }

    @Override
    protected void travelTime() {
        System.out.println("Airplane is the quickest type of traveling");
    }
}
