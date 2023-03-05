package day17_PracticeTasks;
import java.util.Scanner;
public class RoomReservation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String room = "";
        System.out.println("do you need room reservation?");
        String reserve = scan.next().toLowerCase();

        while (!(reserve.equals("yes") || reserve.equals("no"))) {
            System.out.println("please only enter 'yes!' or 'no!'");
            reserve = scan.next().toLowerCase();
        }
        if (reserve.equals("yes")) {
            System.out.println("which type of room do you want to reserve");
            room = scan.next().toLowerCase();
            while (!(room.equals("king") || room.equals("queen") || room.equals("single"))) {
                System.out.println("please only enter 'King!' 'Queen!' or 'Single!'");
                room = scan.next().toLowerCase();
            }
        }else {
            System.out.println("have a nice day");
        }
        switch (room) {
            case "king":
                System.out.println("King bed price is: ==>120$");
                break;
            case "queen":
                System.out.println("Queen bed price is: ==105$");
                break;
            case "single":
                System.out.println("Single bed price is: ==>80$");
                break;
        }
    }
}
