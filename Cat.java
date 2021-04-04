package objects;

public class Cat {

     String name;
     boolean isHungry;


    public Cat(String name) {

        this.name = name;
        this.isHungry = true;

    }

    public void eat(String someFood){
        if(this.isHungry){
            System.out.printf("%s is eating %s %n", this.name, someFood);
            this.isHungry = false;
        } else {
            System.out.printf("%s is eating %n", this.name);
        }
    }

    public void isHungry(){
        if(this.isHungry ){
            System.out.printf("%s is hungry %n", this.name);
        } else {
            System.out.printf("%s is not hungry %n", this.name);
        }
    }


    public void play(String withToy){
        System.out.printf("%s is playing with %s %n", this.name, withToy);
    }


    public void sleep(int someTime){
        System.out.printf("%s is going to sleep for %d hours %n", this.name, someTime);
        this.isHungry = true;
    }
}


