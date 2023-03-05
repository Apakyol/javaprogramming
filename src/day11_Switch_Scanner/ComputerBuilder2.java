package day11_Switch_Scanner;
import java.util.Scanner;
public class ComputerBuilder2 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("Select screen size:");
        double screen = inp.nextDouble();
        System.out.println("Select CPU type:");
        String CPU = inp.next();
        System.out.println("Select RAM size:");
        int RAM = inp.nextInt();
        System.out.println("Select storage type:");
        String storageType = inp.next();
        System.out.println("Select storage size:");
        int storageSize = inp.nextInt();
        System.out.println("Select screen resolution:");
        String screenRes = inp.next();

        double sum = 0;


        if (screen == 13.3){
            sum += 200;
        } else if (screen == 15.0) {
            sum += 300;
        }else
            sum += 400;

        if (CPU.equals("i3")){
            sum+=150;
        } else if (CPU.equals("i5")) {
            sum+=250;
        }else
            sum+=350;

        sum+=(RAM/4)*50;

        if (storageType.equals("HDD") && storageSize == 500){
            sum+= 50;
        } else if (storageType.equals("HDD") && storageSize == 1000)
            sum+= 100;
        if (storageType.equals("SSD") && storageSize == 500){
            sum+= 100;
        } else if (storageType.equals("SSD") && storageSize == 1000)
            sum+= 200;
        if (screenRes.equals("FULLHD")){
            sum+=100;
        }else sum+=200;
        System.out.println("Final price is: $"+sum);

    }
}



