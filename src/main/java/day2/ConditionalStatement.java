package day2;

import java.util.Scanner;

public class ConditionalStatement {
    public static void main(String[] args) {

      Scanner input = new Scanner(System.in);
//
//        System.out.println("Enter Your Age, Please: ");
//
//        int personAge =input.nextInt();
//
//        System.out.println("Your Age is : "+personAge);
//         String  status = personAge  >=18 ? "good to vote " : "not good to vote ";
//        System.out.println("Your Age is : "+status);
//
//        if (personAge >=18){
//            System.out.println("good to vote ");
//        }else {
//            System.out.println("not good to vote");
//        }

        System.out.println("Enter a number to decide even or odd");
        int number= input.nextInt();
        if(number>0) {
            if (number == 0) {
                System.out.println("You are even");
            } else if (number % 2 == 0) {
                System.out.println("You number is "+number+ " is even");
            } else {
                System.out.println("You number is " +number+ " is odd");
            }

        }else
            System.out.println("Negative number is not allowed");













    }
}
