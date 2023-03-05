package day13_String;

public class StringMethod3 {

    public static void main(String[]args) {
       String str="      islam      ";
       boolean r=str.isEmpty();
        System.out.println("r = " + r);

        boolean r1=str.isBlank();
        System.out.println("r1 = " + r1);
        String word1= "WorlD";
        String word2= "world";
        System.out.println(word1.equals(word2));
        System.out.println(word1.equalsIgnoreCase(word2));
        String sentence= "I love Java Programming";
        boolean hasCSharp=sentence.contains("C#");
        System.out.println("hasCSharp = " + hasCSharp);
        boolean hasJava=sentence.contains("Java");
        System.out.println("hasJava = " + hasJava);
        String word="world";
        boolean result1=word.startsWith("w");
        System.out.println("result1 = " + result1);
        boolean result2=word.endsWith("d");
        System.out.println("result2 = " + result2);



    }
}
