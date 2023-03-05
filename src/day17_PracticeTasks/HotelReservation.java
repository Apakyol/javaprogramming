package day17_PracticeTasks;
import java.util.Scanner;
public class HotelReservation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String room ="";
        System.out.println("do you want to reserve a room?");
        String R = input.next();

        while (!(R.equals("yes") || R.equals("no"))) {
            System.out.println("please enter yes or no only");
            R = input.next();
        }
        if (R.equals("yes")) {
            System.out.println("what type of room do you want?");
            room=input.next();
            while (!(room.equals("king") || room.equals("queen") || room.equals("single"))) {
                System.out.println("please enter king, queen or single only");
                room = input.next();
            }
        }else {
            System.out.println("have a nice day, goodbye");

            } if (room.equals("king")) {
                System.out.println("king bed is ==> 180$");
            } if (room.equals("queen")) {
                System.out.println("queen ben is ==> 120$");
            }  if(room.equals("single")) {
                System.out.println("single bed is ==> 80$");
            }


    }
}