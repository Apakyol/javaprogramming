package day13_String;
public class StringMethods2 {
    public static void main(String[] args) {
     /*
     String str="Abdulhamid PAKYOL";

     str=str.replace("d", "t");
        System.out.println("change the name of Abdulhamid PAKYOL" +
                " to  = " + str);
    String str1= "I Love Java, Java is wonderful";
        System.out.println("once upon a time I think, " + str1);
            str1=str1.replace("Java", "C++");
        System.out.println("now  I would like to say, " + str1);
        str1=str1.replaceFirst("I", "YOU");
        System.out.println("str1 = " + str1);
      */
        String str3="I Love Java, Java is wonderful";
        String result2=str3.substring(str3.indexOf("L"), str3.indexOf("is"));
        System.out.println("result2 = " + result2);
        String r=str3.repeat(4);
        System.out.println("r = " + r);
        String str="you are so dumb";
        str=str.replace("dumb", "cool");
        System.out.println(str);



    }
}




