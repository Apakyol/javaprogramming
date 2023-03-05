package day13_String;
import java.util.Scanner;
public class IndexOfA {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("enter the word");
        String word = s.next();
        int indexNumOfFirsta=word.indexOf("a");
        System.out.println("index of a: " + indexNumOfFirsta);


        /*
        Index of a: $index number

#### Note: If there is multiple occurrences of the letter `a`
we will output only the index of the first occurrence

Main topics: String manipulation, Scanner, methods, primitive datatypes,
concatenation

```
Ex:
  Input:
    apple

  Output:
    Index of a: 0
         */
    }
}
