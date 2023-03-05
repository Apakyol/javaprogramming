package day17_PracticeTasks;
import java.util.Scanner;
public class Reservation {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String room="";
        System.out.println( "do you want to reserve a room?");
        String R=input.next();

        while (!(R.equals("yes") || R.equals("no"))){
            System.out.println("Please enter only yes or no");
            R=input.next();
        }
        if(R.equals("yes")) {
            System.out.println("what type of room do you want?");
            room = input.next().toLowerCase();
            while (!(room.equals("king") || room.equals("queen") || room.equals("single"))) {
                System.out.println("Please enter only king, queen or single");
                room = input.next();
            }
        }else {
            System.out.println("have a nice day !");

            }
        switch (room) {
            case "king":
                System.out.println("king room is ==> 120$");
                break;
            case "queen":
                System.out.println("queen room is ==> 100$");
                break;
            case "single":
                System.out.println("single room is ==> 80$");
                break;
        }

        }


    }

