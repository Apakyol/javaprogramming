package day10_NestedIfTernaries;
import java.util.Scanner;
public class GradeLevel {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter age:");
        int age = input.nextInt();
        if (age < 3) {
            System.out.println("ineligible");
        }
        if (age >= 3 && age <= 4) {
            System.out.println("preschool");
        }

        if (age == 5) {
            System.out.println("kindergarten");
        }
        if (age <= 10 && age >= 6) {
            System.out.println("elementary");
        }

        if (age <= 13 && age >= 11) {
            System.out.println("middle school");
        }

        if (age <= 18 && age >= 14) {
            System.out.println("high school");
        }
        else{
            System.out.println("college");
        }

        /*

```
less than 3   -> ineligible
3-4           -> preschool
5             -> kindergarten
6-10          -> elementary school
11-13         -> middle school
14-18         -> high school
19+           -> college
```

#### Hint: Use a multi branch if statement

Main topics: if statements, primitive variables, operators

```
Ex:
  Input:
    8

  Output:
    elementary
```
         */


    }
}
