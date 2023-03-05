package day04_Variables;

public class quiz {
    public static void main(String[] args) {
       /*
        int num=-5;

        System.out.print(num++ +",");
        System.out.print(num=0);
        System.out.print(","+ --num);

        short s= 13-9/3*10;
        s += -10;
        System.out.println(s);

        boolean one= ('a'!='z' && false);
        boolean two= one || 0 == (9-10+1);
        System.out.println(two);
        */
         /* long l=100;
        short s=(short) l;
        System.out.println(l+10);
         */
        int a=10;
        a= --a + a++ +a-- + a++;
        System.out.println(a);
    }

}
