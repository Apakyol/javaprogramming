package day13_String;
import java.util.Scanner;
public class Sandwich2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("enter a word");
        String str = scan.next();
        int first = str.toLowerCase().indexOf("bread");
        int last = str.toLowerCase().lastIndexOf("bread");
        if(first == last){
            System.out.println("nothing");
        }else{
            System.out.println(str.substring(first+5,last));
        }


    }
}
