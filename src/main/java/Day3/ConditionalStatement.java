package Day3;

import java.util.Scanner;

public class ConditionalStatement {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter 1st number, plz: ");
//        int num1 = sc.nextInt();
//        System.out.println("Enter 2nd number, plz: ");
//         int num2 = sc.nextInt();
//         System.out.println("Enter 3rd number, plz: ");
//         int num3 = sc.nextInt();
//         if(num1==num2 && num1==num3){
//         if(num1 > num2 && num1 >num3){
//             System.out.println("1st number "+num1+" is the greatest number");
//         }else if(num2 > num1 && num2 > num3){
//             System.out.println("2nd number "+num2+" is the greatest number");
//         }else {
//             System.out.println("3rd number "+num3+" is the greatest number");
//         }
//         }
        System.out.println("Enter the day number:  ");
        String daynum= sc.nextLine();
//        if (daynum==1){
//            System.out.println("monday");
//        } else if(daynum==2){
//            System.out.println("tuesday");
//
//        }else if(daynum==3){
//            System.out.println("wednesday");
//        }else if(daynum==4){
//            System.out.println("thursday");
//        }else if(daynum==5){
//            System.out.println("friday");
//        } else if(daynum==6){
//            System.out.println("saturday");
//        }  else if(daynum==7){
//            System.out.println("sunday");
//        }else
//            {
//            System.out.println("Invalid day number");
//            }

        switch (daynum) {
            case "Monday":
                System.out.println("1 ");
                break;
                case " Tuesday":
                    System.out.println("2 ");
                    break;
                    case" Wednesday":
                        System.out.println("3");
                        break;
                        case " Thursday":
                            System.out.println("4 ");
                            break;
                            case "Friday":
                            System.out.println("5 ");
                            break;
                             case " Saturday":
                            System.out.println("6 ");
                            break;
                                case"  Sunday":
                                System.out.println("7 ");
                                break; default:
                    System.out.println("Invalid day number");
        }

    }
}
