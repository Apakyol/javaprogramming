package day12_Scanner;
import java.util.Scanner;
public class James {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String first= input.nextLine();
        String last= input.nextLine();
        int num=input.nextInt();
        String aa1= "$a";
        if (num%2==0){
            aa1=first+ " " +last;

         }
    }
}
