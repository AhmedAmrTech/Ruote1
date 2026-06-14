package day6;

abstract class Shape {


//Abstraction: hiding implementation details and showing only the essential behavior
    // Focus on => what an object does, not how it does it.

    /*
     In real life: When you drive a car, you use the steering wheel and pedals (interface),
     but you don't worry about how the engine works (implementation hidden)
    */

    //Abstraction in Java => achieved through abstract classes and interfaces

           abstract void draw();  // abstract

     void info()
     {                                             // concrete method
         System.out.println("Shape");
     }


}
