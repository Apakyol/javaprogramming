package day08_ifStatements;

public class ToVote {
    public static void main(String[] args) {
        String name = "Trump";
        int age = 75;
        String citizenship = "USA";
        Boolean iseligibletoVote = age >= 21 && citizenship == "USA";
        if (iseligibletoVote) {
            System.out.println("Trump "+"is eligible to Vote");
            if (!iseligibletoVote) {
                System.out.println("Trump "+"is not eligible to Vote ");
            }
        }
    }
}