package day15_ForLoop;
import java.util.Scanner;
public class PositiveNegative {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int negative = 0;
        int positive = 0;

        for (int i = 1; i < 6; i++) {
            System.out.println("Enter" + i + ". number: ");
            int user = input.nextInt();
            if (user > 0) {
                positive++;
            } else if (user < 0) {
                negative++;
                System.out.println(positive + " positive and " + negative + " negative");
            }
        }

    }
}