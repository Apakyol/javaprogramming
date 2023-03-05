package day10_NestedIfTernaries;
import java.util.Scanner;
public class PositiveNegativeOrZero {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = s.nextInt();
        if(num>0){
            System.out.println("positive");
        }
        if(num<0){
            System.out.println("negative");
        }
        if(num==0) {
            System.out.println("zero");
        }

    }
}
