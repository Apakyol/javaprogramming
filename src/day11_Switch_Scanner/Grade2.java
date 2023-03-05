package day11_Switch_Scanner;
import java.util.Scanner;
public class Grade2 {

    public static void main(String[] args) {
Scanner scan =new Scanner(System.in);
        System.out.println("ENTER GRADE");
        char ch = scan.next().charAt(0);
        String result = "";
        //  ||
        switch (ch){

            case 'A': case 'B': case 'C': case 'D':
                result = "Passed";
                break;

            case 'F':
                result = "Failed";
                break;

            default:
                result = "Invalid";

        }

        System.out.println(result);


    }

}
/*
    if the grade is A or B or C or D =====>"Passed"
    otherwise ==> "Failed"
 */

