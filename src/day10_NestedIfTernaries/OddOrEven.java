package day10_NestedIfTernaries;
import java.util.Scanner;

public class OddOrEven {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number:");
        int number = input.nextInt();
        if(number%2==0){
            System.out.println(number+" is even");
        }
        else {
            System.out.println(number+" is odd");
        }
        /*
        Ex:
  Input:
    10
  Output:
    10 is even
```
         */
    }
}
