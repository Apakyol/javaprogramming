package day11_Switch_Scanner;
import javax.print.DocFlavor;
import java.util.Scanner;
public class Grade {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("Enter your Grade");
       char ch= scan.next().charAt(0);
        String result = "";

        switch(ch){
            case 'A':
                result = "Excellent";
                break;
            case 'B':
                result= "Great Job";
                break;

            case 'C':
                result= "Good";
                break;

            case 'D':
                result="Passed";
                break;

            case 'E':
                result="Failed";
                break;

            default:
                result="Ridiculous";


            /*
            case 'B':

                result = "Great Job";
                break;

            case 'C':
                result = "Good";
                break;

            case 'D':
                result = "Passed";
                break;

            case 'F':
                result = "Failed";
                break;

            default:
                result = "Invalid";
 */
        }

        System.out.println(result);
    }

}

/*
3. a char variable named grade is given. use switch statement to print the following messages:
			'A': excellent
			'B': great job
			'C': good
			'D': passed
			'F': failed
			otherwise: invalid
 */

