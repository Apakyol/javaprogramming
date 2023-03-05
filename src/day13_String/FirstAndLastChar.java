package day13_String;
import java.util.Scanner;
public class FirstAndLastChar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the word");
        String word = scan.next();

        char f = word.charAt(0);
        int n=word.length();
        char l = word.charAt(n-1);
        System.out.println("first letter: " + f);
        System.out.println("last letter: " + l);

        /*
        first letter: a
        last letter: e
         */


    }
}
