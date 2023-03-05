package day13_String;
import java.util.Scanner;
public class Email {
    public static void main(String[] args) {
     Scanner scan=new Scanner(System.in);
        System.out.println("enter email");
     String email=scan.next();

     String str1=email;
     String result1=str1.substring(email.indexOf(5, 16));
        System.out.println( result1);
/*
String sentence= "I love Java Programming";
        boolean hasCSharp=sentence.contains("C#");
        System.out.println("hasCSharp = " + hasCSharp);
 */

    }
}
