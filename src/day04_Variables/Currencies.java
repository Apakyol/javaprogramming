package day04_Variables;

public class Currencies {

    public static void main(String[] args) {

        // $1000
        int dollar = 1000;

        double lira = dollar *18.2;
        double euro = dollar * 0.9;
        double JPY = dollar * 115;
        double pound = dollar * 0.73;
        double CAD = dollar * 1.25;

        System.out.println("dollar = " + dollar);
        System.out.println("lira = " + lira);
        System.out.println("euro = " + euro);
        System.out.println("pound = " + pound);
        System.out.println("CAD = " + CAD);

    }

}
