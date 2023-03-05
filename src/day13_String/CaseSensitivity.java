package day13_String;
import java.util.Scanner;

public class CaseSensitivity {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String word = s.next();

        //WRITE YOUR CODE BELOW
        String word1=word.toUpperCase();
        System.out.println("uppercase: "+word1);
        String word2=word.toLowerCase();
        System.out.println(word2);
        /*
        word: jAVa
    uppercase: JAVA
    lowercase: java
         */



    }

}
