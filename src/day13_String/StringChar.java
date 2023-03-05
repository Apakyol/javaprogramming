package day13_String;

public class StringChar {
    public static void main(String[] args) {
        String str="CyDEO";
        char ch1=str.charAt(3);
        System.out.print(ch1);
        System.out.println(str.charAt(2));
        System.out.println(str.charAt(4));
        System.out.println(" = *****************" );
        int num1=str.length();
        int indexNumOfLast=str.length()-1;
        System.out.println("indexNumbofLast = " + indexNumOfLast);
        System.out.println(num1);
        System.out.println("length of the String is = " + num1);
        int lastIndex =str.length()-1;
        System.out.println("lastIndex = " + lastIndex);
        str=str.toLowerCase();
        System.out.println("toLowerCase = " + str);
        str=str.toUpperCase();
        String str1="                         toUpperCase = ";
        System.out.println("str1 = " + str1);
        System.out.println("toUpperCase = " + str);
        str1=str.trim();
        System.out.println("str1 = " + str1);

        System.out.println("******************************");
        String str2="East Türkistan";
        str2.replace("ü","u");
        int indexNumOfFirstT=str2.indexOf("T");
        System.out.println("indexNumOfFirstT = " + indexNumOfFirstT);
        int indexNumOfSecondt=str2.indexOf("sta");
        System.out.println("indexNumOfSecondt = " + indexNumOfSecondt);
    }
}
