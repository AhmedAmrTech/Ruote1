package day5;

public class Bike extends Vehicle {



    public Bike() {
        super("yamha"," blue", "2020");
    }
    @Override
    protected  void start() {
        System.out.println("This bike started");
    }

    protected  void ringBell(){
        System.out.println("This bike rings bell");
    }

}
