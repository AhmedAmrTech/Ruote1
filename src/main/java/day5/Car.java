package day5;

public class Car extends Vehicle {

    public Car() {
        super("BMW", "red","2026");
    }
     @Override
    protected  void start() {
         System.out.println("This car started");
    }
    protected  void honk() {
         System.out.println("This car's sound ");
    }
}
