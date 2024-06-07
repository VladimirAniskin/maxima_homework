import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("пожалуйста введите число! ");
        int a = scanner.nextInt();
        int result = 1;
        for (int i = 1; i <= a; i = i + 1 ) {
            result = result * i;

        }
        System.out.println( a + "! введеного числа: равен " + result);
    }
}
