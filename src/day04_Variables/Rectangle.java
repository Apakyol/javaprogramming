package day04_Variables;

public class Rectangle {

    public static void main(String[] args) {
        // length, width, area, perimeter
        // length =10.5
        // width = 5.5
        // area = length * width;
        // perimeter = 2 * (length + width);

        double length = 5.5;
        double width = 10.5;
        double area = length * width;
        double perimeter = 2 * (length + width);
        System.out.println("length = " + length);
        System.out.println("width = " + width);
        System.out.println("area = " + area);
        System.out.println("perimeter = " + perimeter);
    }
}
