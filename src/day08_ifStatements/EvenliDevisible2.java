package day08_ifStatements;

public class EvenliDevisible2 {

    public static void main(String[] args) {
        int number=66;
        boolean devisibleBy2 = number % 2 == 0;
        boolean devisibleBy3 = number % 3 == 0;
        boolean devisibleBy5 = number%5==0;

        System.out.println(number + " is devisible by 2 "+devisibleBy2);
        System.out.println(number + " is devisible by 3 "+devisibleBy3);
        System.out.println(number + " is devisible by 5 "+devisibleBy5);
    }
}
