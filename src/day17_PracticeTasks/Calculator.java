package day17_PracticeTasks;
import java.util.Scanner;
public class Calculator {
public static void main(String[] args){
    Scanner scan=new Scanner(System.in);
    System.out.println("enter your first number" );
    int num1=scan.nextInt();
    System.out.println("enter your second number" );
    int num2=scan.nextInt();
    System.out.println("enter a math operator" );
    char ch1=scan.next().charAt(0);
    while (!(ch1=='+' ||ch1=='-')){
        System.out.println("invalid operator, please reenter" );
        char ch2=scan.next().charAt(0);
    }
    System.out.println((ch1=='+')?num1+num2 : num1-num2);

}
}
