package day5;

public class Doog extends Animal {



    public void bark(){
        System.out.println("this animal barks");
    }


    @Override
    public void eat  () {
        System.out.println("This dog  eats bones ");
    }
    @Override
    public void sound(){
        System.out.println("This dog barks ");
    }
}
