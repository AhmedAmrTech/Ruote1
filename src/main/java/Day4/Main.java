package Day4;

import java.util.Scanner;

public class Main

{
    public static void main(String[] args) {
//        Rectangle rectangle = new Rectangle();
//        double x = rectangle.calculateArea();




        Rectangle r1 = new Rectangle();
        r1.setLength(5);
        r1.setWidth(5);
        double areaOFRoom1 = r1.calculateArea();

        System.out.println("The area of Room 1 is: " + areaOFRoom1);

        Rectangle r2 = new Rectangle();
        r2.setLength(10.5);
        r2.setWidth(10.5);
        double areaOfRoom2 = r2.calculateArea();
        System.out.println("The area of Room 2 is: " + areaOfRoom2);

        System.out.println("___________________________");
        double totalArea = areaOFRoom1 + areaOfRoom2;
        System.out.println("The total space of room 1 and room 2 is: " + totalArea);



    }

    public static void hamdar()
    {
        System.out.println("Hamda");
    }


    public  void total(int x,int y) {

        int sum = x+y;

        System.out.println(" The Total is " + sum);
    }

}


