package day05_Concatenation;

import javax.lang.model.SourceVersion;
import java.sql.SQLOutput;

public class FullName {

    public static void main(String[] args) {


        String firstName = "Abdullah";
        String lastName = "PAKYOL";
        int age = 19;
        String jobTitle = "SDET";
        String companyName = "UK TELECOM";
        double salary = 100000;

        String fullName = firstName + " " + lastName;

        // Full name of the person is -------
        System.out.println("Full name of the person is " + fullName);

        //--- is  --- years old
        System.out.println(fullName +" is " + age +" years old" );

        //FullName is JobTitle, works at CompanyName, and FullName, salary is Salary
        System.out.println(fullName +" is"+ jobTitle +", works at " + companyName +", and "+fullName +"'s salary is $ "+salary);
    }
}
