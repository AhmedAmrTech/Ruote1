package day2;

import java.sql.SQLOutput;

public class Operators {

    public static void main(String[] args) {
      //int x = 20;
      //int y = 20;
       // System.out.println(x==y);
        //System.out.println(x=y);
        //System.out.println("x= "+x);
        //System.out.println(x!=y);

        //double a = 15.0;
        //
        // int b = 15;

        //
        // System.out.println(a==b);
        //System.out.println(a!=b);
//        int a =25;
//        System.out.println(" The value of a = "+a);
//        int b =25;
//        System.out.println("The sum of a and b = "+a+b);
//
//        a=a+5;
//        a+=5;               // shorthand assignment
//        System.out.println(a);
//
//        a =a -5;
//        a-=5;
//        System.out.println("The sub of a -5 ="+a);
//
//        a=a*5;
//        a*=5;
//        System.out.println("the multi of a and 5 = "+a);
//
//        a=a /5;
//        a/=5;
//        System.out.println("The div of a and 5 = "+a);
//
//        //System.out.println( "the div of a is  %d%n "+ a);
//        System.out.printf("The div of a is:%d%n" ,a/5);

       /* int x =15;
        int y =3;
        System.out.println(x%y);
        if (x%y==0){
            System.out.println("it is even ");
        }else {
            System.out.println("it is odd ");
        }*/

//       int a =7;
//        int b=5;
//        int c =7;
//        int d=7;
//        System.out.println(a>b);
//        System.out.println(a<b);
//        System.out.println(a==b);
//        System.out.println(a>=b);
//        System.out.println(a<=b);

//       boolean v1 = true;
//       boolean v2 = false;
//
//       System.out.println(v1 && v2);
//       System.out.println(v1 || v2);
//
//        System.out.println(a>b&&b<c);
//
//        System.out.println(a>b&&b>c);
//
//        System.out.println(a<b||d>a);
//
//        System.out.println(a<=b||d>=a);
//        int abdi=20;
//        int almi=15;
//        boolean temaioz = true;
//        if(almi>abdi&&temaioz)
//        {
//            System.out.println("ادخل ادبي");
//        }else {
//            System.out.println("ادخل علمي");
//        }

        int num = 10;
        System.out.println(num++);
        System.out.println(num);
        System.out.println(++num);

        int number = 5;
        System.out.println(number++);
        System.out.println(number);
        System.out.println(++number);

        int a = 18,b = 10,c;
        c = (a>b) ? a : b;
        System.out.println("the largest number is " + c);

        if (a>b)
            c=a;
        else
            c=b;
    }
}
