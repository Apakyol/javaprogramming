package day11_Switch_Scanner;
import java.util.Scanner;
public class ComputerBuilder {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        double price=0;
        String  storagetype, screenResolution, cputype;
        double ramsize, screensize;
        int storagesize;

        System.out.println("Select screen size:");
        screensize=input.nextDouble();
        if (screensize==13.3){
            price+=200;
        } else if (screensize==15.0){
            price+=300;
        }else if (screensize==17.3){
            price+=400;
        }

        System.out.println("Select CPU type:");
        cputype=input.next().toLowerCase();
        if (cputype.equals("i3")){
          price+=150;
        } else if (cputype.equals("i5")) {
          price+=250;
        } else if (cputype.equals("i7")) {
           price+=350;
        }
        System.out.println("Select RAM size");
        ramsize=input.nextDouble();
        price+=(50*ramsize)/4;

        System.out.println("Select storage type:");
        storagetype=input.next();

        System.out.println("Select storage size:");
        storagesize=input.nextInt();

        if (storagetype.equals("HDD")){
            price+=(storagesize/500)*50;
        } else if (storagetype.equals("SSD")) {
            price+=(storagesize/500)*100;
        }
        System.out.println("Select screen resolution:");
        screenResolution=input.next();
        switch (screenResolution) {
            case "4K":
                price += 100;
                break;
            case "FULLHD":
                price += 200;
                break;

        }
        System.out.println("Final price:"+"$"+price);
        }
        }



