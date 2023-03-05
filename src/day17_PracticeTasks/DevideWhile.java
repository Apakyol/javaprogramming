package day17_PracticeTasks;
import java.util.Scanner;
public class DevideWhile {
    public static void main(String[] args) {
        /*
        1. Write a program that can divide two positive numbers without using
        / (division) and * (multiplication) operators.
         */
                Scanner scan = new Scanner(System.in);
                System.out.println("enter 1. positive number");
                int num1 = scan.nextInt();
                System.out.println("enter 2. positive number");
                int num2 = scan.nextInt();
                int count = 0;

        while (num1 >= num2) {
            num1 -= num2;
            count++;
        }

        System.out.println(count+" with a remainder of "+num1);

    }
        }

