import java.util.Scanner;

public class Raznost {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Пожалуйста введите первое число!");
        int a = scanner.nextInt();
        System.out.println("Пожалуйста введите второе число!");
        int b = scanner.nextInt();
        int result;
        if ( a < b ) {
            result = b - a;
        } else {
            result = a - b;
        } System.out.println("Ответ: " + result);

    }
}
