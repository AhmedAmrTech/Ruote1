package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello big boy!");


        /*
           System.out.println("Hello big boy!");
        */


        /* String firstName = "Ahmed";
        String x = "2 + 2";
        System.out.println(x);

        String X = "10";
        String y = "15";
        System.out.println(X+y);*/

        //Numbers

            //1- int

        /* int x = 1000;
        int y = 2000;

       // System.out.println(x + y);
      // System.out.println("Sum of x and y is: " , x + y);
        System.out.println("Sum of x and y is: ");
        System.out.println(x + y);


        float f = 12.09f;
        System.out.println(f);

        //3- Double

        double d = 55;

        double l = 55.33;
        System.out.println(d);
        System.out.println(l);*/


        String firstName = "Ahmed";
        String lastName = "amr";

        String fullName = firstName + " " + lastName;
        int age = 19;
        String datOfBirth = "20/05/2002";
        String job = "Testing Engineer";
        double income = 10.5;
        double tax = income * 0.15;
        double netSalary = income -tax;

// print
        System.out.println("Hello my name is: " +fullName+
                "\nmy age is: " +age+
                "\nmy job is: :" +job+
                "\nmy income is: " +netSalary);

        System.out.println("________________________________");

        System.out.printf("Hello my full name is: %s%n" + "my age is: %d%n" + "my job is: %s%n" + "my income is: %f%n",
                fullName, age, job, netSalary);

    }
}