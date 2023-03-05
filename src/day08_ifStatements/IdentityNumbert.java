package day08_ifStatements;
import java.util.Scanner;

public class IdentityNumbert {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Number");
        int number = input.nextInt(); //19


        boolean IsPositiveNumber = number>0;
        boolean IsNegativeNumber = number<0;
        boolean IsZero = number==0;

        if(IsPositiveNumber) {
            System.out.println(number+ " is a positive number ");
        }
        if(IsNegativeNumber) {
            System.out.println(number+ " is a negative number  ");
        }
        if(IsZero) {
            System.out.println(number+ " is Zero" );
        }
    }
}
