package day15_ForLoop;

public class SumOfNumbers {

    public static void main(String[] args) {


        int sum = -5050;
        // +1 +2 +3 .... +100

        for (int i = 1; i < 101 ; i++) { //i: 1,2,3,4,5,6... 100
            sum += i;
        }

        System.out.println(sum); //5050

        System.out.println("---------------------------------------");


    }

}
