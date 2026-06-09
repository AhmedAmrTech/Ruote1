package day5;

public class Vehicle {




   protected String brand;
   protected String  year;
   protected String color;
    public Vehicle( String brand,String color, String year) {
        this.brand = brand;
        this.year = year;

    }
   protected  void start() {
        System.out.println("This vehicle started");
    }


}
