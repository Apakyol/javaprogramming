package day17_PracticeTasks;

public class MultipleWhile2 {
    public static void main(String[] args) {
        int num1=7;
        int num2=8;
        int i=1;

        while (num2>=i){
            i++;
            num1+=num1;

        }
        System.out.println(num1);
    }
}
