package day10_NestedIfTernaries;
import java.util.Scanner;

public class BlackJack {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter the first number");
        int house = s.nextInt();
        System.out.println("enter the second number");
        int player = s.nextInt();

        if(player>21){
            System.out.println("player bust");
        }
        if(player==house){
            System.out.println("its a tie");
        }
        if(player==21 && player>house ){
            System.out.println("player win");
        }
        if(house>player){
            System.out.println("player lose");
        }
        if(player>house && player>21){

        }

        /*
        > - if the `player` score is bigger than `21`, the result is `player bust`
> - if the `player` score is equal to the `house` score, the result is `its a tie`
> - if the `player` score is equal to `21`, the result is `player win`
> - if the `house` score is bigger than the `player` score, the result is `player lose`
> - if the `player` score is bigger than the `house` score, the result is `player win`
         */


}



    }
