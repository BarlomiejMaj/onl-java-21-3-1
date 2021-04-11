package inheritance;

public abstract class Transport {

    protected abstract void go();
    protected abstract void makeSound();
    protected abstract void beep();
    protected abstract void capacity();
    protected abstract void travelTime();

    public void pollution(){
        System.out.println("Transport generate a pollution!");
    }

}
