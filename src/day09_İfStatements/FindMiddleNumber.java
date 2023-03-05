package day09_İfStatements;
import java.util.Scanner;
public class FindMiddleNumber {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter the first number");
        int n1 = s.nextInt();
        System.out.println("enter the second number");
        int n2 = s.nextInt();
        System.out.println("enter the third number");
        int n3 = s.nextInt();

        if((n1 > n2  && n2 > n3) || (n3>n2 && n2>n1) ){
            System.out.println("middle number is: " + n2); // 1>2, 2>3
        }
        if((n3>n1 && n1>n2) || (n2>n1 && n1>n3)  ){
            System.out.println("middle number is: " + n1);
        }
        if((n2>n3 && n3>n1) ||(n1>n3 && n3>n2)  ){
            System.out.println("middle number is: " + n3);
        }


        /*
        ### Using `if statements` and `Scanner` write a program that will read three number inputs. Then using those number determine which number is the middle number. Follow the exact flow from the examples below.

```
Hint:

1. Create an object of Scanner class.
2. Declare int 3 variables
3. Use Scanner to assign numbers from console into the variables
4. Use if statements to find the middle number
```

Main topics: if statements, primitive variables, operators, Scanner


**Example Flows:**

```
Enter first number:
14
Enter second number:
52
Enter third number:
25

middle number is: 25
         */
    }
}
