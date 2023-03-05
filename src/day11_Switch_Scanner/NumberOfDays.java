package day11_Switch_Scanner;

public class NumberOfDays {

    public static void main(String[] args) {
        int y = 2000;
        int z = 4;

        String result = "";

        if(z >= 1 && z <= 12){ // number: 1~12

            switch (z){
                case 2:
                    result = (y % 4 ==0)? "29 days" : "28 days";
                    break;

                case 4: case 6: case 9: case 11:
                    result = "30 days";
                    break;

                default: //1, 3, 5,7,8, 10, 12
                    result = "31 days";
            }

        }else{
            result = "Invalid Number";
        }


        System.out.println(result);


    }

}


