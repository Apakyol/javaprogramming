package day10_NestedIfTernaries;
import java.util.Scanner;
public class GreaterNumber {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter the first number");
        int a = s.nextInt();
        int b = s.nextInt();

        if(a>b) {
            System.out.println(a+" is greater ");
        }
        if(b>a) {
            System.out.println(b+" is greater ");
        }
        /*
        ### Use an `if statement` to determine if the given number `a` is greater
        than the other given number `b`. Print out which is the biggest in the following format:

#### $number is greater

#### Note: The two given numbers will not be equal

Main topics: if statements, primitive variables, concatenation, operators

```
Ex:
  Input:
    1
    2

  Output:
    2 is greater
         */


    }
}
