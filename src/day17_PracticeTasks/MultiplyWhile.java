package day17_PracticeTasks;
import java.util.Scanner;
public class MultiplyWhile {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("enter 1. positive number");
        int n1=scan.nextInt();
        System.out.println("enter 2. positive number");
        int n2=scan.nextInt();
        int sum=0;

        for (int i=0; i<n1; i++){
            sum=sum+n2;

        }
        System.out.println(n1+" multiply by "+n2 +" = "+ sum);



    }
}

