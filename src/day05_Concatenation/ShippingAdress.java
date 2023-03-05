package day05_Concatenation;

public class ShippingAdress {

    public static void main(String[] args) {

    String name = "Abdulhamid PAKYOL",
            buildingNumber = "B2 NO:37",
            streetName = "EVLIYA CELEBI STREET",
            city = "ISTANBUL",
            state = "TURKIYE",
            zipCode = "34480";

    String address = name + "\n" + buildingNumber + " " + streetName +
            "\n" + city + ", " + state + " " + zipCode;
    System.out.println( name + "\n" + buildingNumber + " " + streetName +
            "\n" + city + ", " + state + " " + zipCode);

}
}
