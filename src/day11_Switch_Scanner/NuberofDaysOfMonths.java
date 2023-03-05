package day11_Switch_Scanner;
import java.util.Scanner;
public class NuberofDaysOfMonths {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("year");
        int year = scan.nextInt();
        System.out.println("month");
        int month = scan.nextInt();
        String result= "";

        if (month >= 1 && month <= 12) {
            switch (month) {
                case 2:
                result=(year%4==0)? "29days" : "28days";
                break;

                case 4: case 6: case 9: case 11:
                    result="30days";
                    break;

                default:
                    result="31days";
            }
        }else {
            System.out.println("invalid input");
        }
        System.out.println(result);
    }
}
