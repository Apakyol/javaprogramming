package day11_Switch_Scanner;
import java.util.Scanner;
public class Calendar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter month number:");
        int monthNum = scan.nextInt();
        String result = "";

        if(monthNum >= 1 && monthNum <= 12){
            switch (monthNum) {
                case 1:
                    System.out.println(monthNum + " January");
                    break;
                case 2:
                    System.out.println(monthNum + " February");
                    break;
                case 3:
                    System.out.println(monthNum + " March");
                    break;
                case 4:
                    System.out.println(monthNum + " April");
                    break;
                case 5:
                    System.out.println(monthNum + " May");
                    break;
                case 6:
                    System.out.println(monthNum + " June");
                    break;
                case 7:
                    System.out.println(monthNum + " July");
                    break;
                case 8:
                    System.out.println(monthNum + " August");
                    break;
                case 9:
                    System.out.println(monthNum + " September");
                    break;
                case 10:
                    System.out.println(monthNum + " October");
                    break;
                case 11:
                    System.out.println(monthNum + " November");
                    break;
                case 12:
                    System.out.println(monthNum + " December");
                    break;
        }


        }else{
            System.out.println("Invalid month number");
        }

                /*

                 */


    }
}
