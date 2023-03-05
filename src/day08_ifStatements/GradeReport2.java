package day08_ifStatements;

public class GradeReport2 {

    public static void main(String[] args) {
        int score =85;
        System.out.println("Your Score is "+score);
        boolean a= score>=90 && score<100;
        boolean b= score>=80 && score<90;
        boolean c= score>=70 && score<80;
        boolean d= score>=60 && score<70;
        boolean e= score>=50 && score<60;

        if(a) {
            System.out.println("Excellent! ");
        }
        if(b) {
            System.out.println("Great !");
        }
        if(c) {
            System.out.println("Good !");

        }
        if(d) {
            System.out.println("passed ");
        }
        if(e) {
            System.out.println("Failed ");
        }
    }
}
