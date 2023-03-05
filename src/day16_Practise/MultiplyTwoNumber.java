package day16_Practise;
import java.util.Scanner;
public class MultiplyTwoNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter 1. positive number");
        int num1 = scan.nextInt();
        System.out.println("enter 2. positive number");
        int num2 = scan.nextInt();
        int res = 0;
        if (num1 >= 0 && num2 >= 0) {
            for (int i = 0; i < num2; i++) {
                res = res + num1;

            }
            System.out.println(res);

        }else
            System.out.println("invalid");
    }
}
