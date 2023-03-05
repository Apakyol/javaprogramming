package day19_PractiseTasks;
import java.util.Scanner;
public class CalculatePerimeterOfCircle {
    public static void main(String[] args) {

        while (true) {

            Scanner input = new Scanner(System.in);
            System.out.println("enter Radius");
            int Radius = input.nextInt();
            double pi = 3.14;
            while (!(Radius > 0)) {
                System.out.println("Invalid Entry for the radius of the circle");
                System.out.println("enter Radius");
                Radius = input.nextInt();
            }
            System.out.println("Diameter of the circle= " + Radius * 2);
            System.out.println("Area of circle= " + Radius * Radius * pi);
            System.out.println("Perimeter of circle= " + 2 * Radius * pi);

            System.out.println("Would you like to calculate another circle?");
            String yesno = input.next().toLowerCase();

            if (yesno.equals("no"))
                break;
            {
                System.out.println("Thank you for using Cydeo Circle Calculator APP");
            }
        }
    }
}






