package day18;
import java.util.Scanner;
public class HotelReservation {
    public static void main(String[] args) {
        /*
        Create a class called RoomReservation, write a program for the room reservation:
            King Bed ==> 120$
            Queen Bed ==> 100$
            single Bed ==> 80$

            the program asks the user which bedroom does he/she wants to reserve,
             and how many nights he/she is staying.
            Then Ask the user "would you like to reserve another room?""
                            if yes ==> repeat the entire steps
                            if no ==> return the  total price

            	If user enters any invalid entry,  ask the user to re-enter until user
            	 provides a valid entry
         */
        Scanner input = new Scanner(System.in);
        int price = 0;
        int totalPrice = 0;

        while(true) {
            System.out.println("which bedroom do you want to reserve?");
            String room = input.next();
            while (! (room.equals("king")||room.equals("queen")||room.equals("single"))){
                System.out.println("Invalid room type, please re-enter:king/queen/single");
                room = input.next();
            }

            System.out.println("how many nights will you stay?");
            int days = input.nextInt();
            while (!(days>0)){
                System.out.println("Invalid number of day, please re-enter:");
                days = input.nextInt();
            }
            if (room.equals("king")){
                price= 120*days;
            } else if (room.equals("queen")) {
                price= 100*days;
            } else if (room.equals("single")) {
                price= 80*days;
            }
            totalPrice+=price;
            System.out.println("would you like to reserve another room?");
            String answer = input.next().toLowerCase();


            if (answer.equals("no"))
                break;
        }
        System.out.println(totalPrice+"$");
    }
}




