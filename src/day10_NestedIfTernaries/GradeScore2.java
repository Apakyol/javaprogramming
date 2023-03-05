package day10_NestedIfTernaries;

public class GradeScore2 {

    public static void main(String[] args) {

        int s=89;

        String    result2 = (s >= 90) ?
        "Excellent"  : (s >= 80) ?
                "Great" : (s >= 70) ? "Good"
                    : (s >= 60) ? "Passed" : "Failed";


        System.out.println(result2);



    }
}
