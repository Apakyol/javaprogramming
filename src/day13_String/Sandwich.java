package day13_String;
import java.util.Scanner;
public class Sandwich {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("enter a word");
        String sandwich=scan.next();
        boolean sandwich1=sandwich.contains("jam");
        if(sandwich1){
            System.out.println("jam");
        }
        if(!sandwich1){
            System.out.println("nothing");
        }


    }



}
