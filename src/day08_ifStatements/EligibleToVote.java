package day08_ifStatements;

public class EligibleToVote {

    public static void main(String[] args) {

        String name = "Josh";
        int age = 15;
        String citizen = "USA";

        System.out.println("Voters İnformation: " +
                name +",age:"+ age+"/"+"Citizenship:"+citizen);

        boolean isEligible = age >= 21 && citizen == "USA"; //True
        System.out.println("jam");


        }
    }

