package day18;

public class FrequencyOfChr {
    public static void main(String[] args) {
        System.out.println(" ============================================================ ");
        String str1 = "aabccdeef";
        String res1 = "";
        for (int i = 0; i < str1.length(); i++) {
            int count = 0;

            for (int j = 0; j < str1.length(); j++) {
                if (str1.charAt(i) == str1.charAt(j)) {
                    count++;
                }
            }
            if (count == 1) {
                res1 += str1.charAt(i);
            }
        }
        System.out.println(res1);
    }
}
