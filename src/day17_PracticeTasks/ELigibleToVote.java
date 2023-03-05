package day17_PracticeTasks;
import java.util.Scanner;
public class ELigibleToVote {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("Enter your age: ");
        int age= scan.nextInt();
        while (!(age>=1 && age<=120)){
            System.out.println("invalid entry, please Re-enter ");
            System.out.println("Enter your age: ");

        }
    }
}
