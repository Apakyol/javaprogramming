package day10_NestedIfTernaries;
import java.util.Scanner;
public class ApartmentLeasing {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to Cydeo Apartments!");
        System.out.println("How many bedrooms are you looking for?");
        int numberOfBedrooms = scan.nextInt();
        if(numberOfBedrooms==1) {
            System.out.println("One Bedroom Selected\n" +
                    "Starting Price: 1100");
        }
        if(numberOfBedrooms==2) {
            System.out.println("Two Bedroom Selected\n" +
                    "Starting Price: 1850");
        }
        if(numberOfBedrooms==3){
            System.out.println("Three Bedroom Selected\n" +
                    "Starting Price: 2550");
        }
        else {
            System.out.println("Sorry, we do not offer that many bedrooms");
        }

        /*
        > - 1 bedroom: 1100
        > - 2 bedroom: 1850
        > - 3 bedroom: 2550

#### Note: If an invalid bedroom number is given no price is displayed

#### Note: Can use multiple if statements or a multi branch if statement

Main topics: if statements, primitive variables, concatenation, operators

**Example Flows:**
```
Welcome to Cydeo Apartments!
How many bedrooms are you looking for?
1
One Bedroom Selected
Starting Price: 1100
```
         */
    }
}
