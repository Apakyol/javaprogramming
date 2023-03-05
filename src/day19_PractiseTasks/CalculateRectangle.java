package day19_PractiseTasks;
import java.util.Scanner;
public class CalculateRectangle {
    public static void main(String[] args) {
        while (true) {
         Scanner input=new Scanner(System.in);
            System.out.println("Enter the length of the Rectangle:");
            double length=input.nextDouble();
            while (!(length>0)) {
                System.out.println("Invalid Entry for the length of the rectangle");
                break;
            }
            System.out.println("Enter the width of the Rectangle:");
            double width=input.nextDouble();
             while (!(width>0)){
                 System.out.println("Invalid Entry for the width of the rectangle");
                 break;
             }
            System.out.println("Perimeter of rectangle "+ 2*(width+length));
            System.out.println("Area of rectangle "+ width*length);

            System.out.println("Would you like to calculate another Rectangle?");
            String yesno=input.next().toLowerCase();
            if (yesno.equals("no"))
                break;
            }
        }
    }

