package day19_PractiseTasks;
import java.util.Scanner;
public class CalculateOfSquare {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.println("Enter the side of the square:");
            double a = input.nextInt();
            double b = input.nextInt();
            while (!(a > 0 && b > 0)) {
                System.out.println("Invalid Entry for the side of the square");
                System.out.println("Enter the side of the square:");
                a = input.nextInt();
                b = input.nextInt();
            }
            System.out.println("Perimeter of square :" + 2 * (a + b));
            System.out.println("Area of square:" + (a * b));

            System.out.println("Would you like to calculate another Square?");
            String yesno = input.next().toLowerCase();

            if (yesno.equals("no"))
            break;
            {
                System.out.println("Thank you for using Cydeo Square Calculator APP");
            }
        }
    }
}


