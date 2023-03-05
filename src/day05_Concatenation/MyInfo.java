package day05_Concatenation;

public class MyInfo {

    public static void main(String[] args) {

        String firstName = "Abdulhamid",
                     familyName = "PAKYOL",
                     age = "49",
                     schoolName = "CYDEO",
                     jobTitle = "SDET",
                     companyName = "UKTELECOM",
                     myInfo = firstName + "  "+familyName;
        int doubleSalary= 180000;

        System.out.println("My full name is " + myInfo +" ," +
                age+ " years old, "+ "graduated School is "+schoolName+
                ", I am an " +jobTitle+
                " ,My annual salary is "+" £ "+
                doubleSalary);

    }
}
