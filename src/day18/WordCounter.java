package day18;

public class WordCounter {
    public static void main(String[] args) {
        String str = "aabcccd";
        String  res="";

        for (int i = 0; i <str.length() ; i++) {
            int count=0;
            for (int j = 0; j <str.length() ; j++) {
                if (str.charAt(i)==str.charAt(j))
                    count++;
            }
            if (!(res.contains(str.charAt(i)+"")))
                res+=str.charAt(i)+""+count;
        }
        System.out.print(res);

    }
}
