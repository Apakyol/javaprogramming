package day13_String;

import java.util.Scanner;

public class StartAndEndWith {

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter a word");
        String word=s.next();

        boolean result=word.startsWith("a");
        boolean result1=word.endsWith("e");
        System.out.println("Starts with a: " + result);
        System.out.println("Ends with e: " + result1);

    }
}
