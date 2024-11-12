import java.util.Scanner;

public class Uslovie {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Пожалуйста введите первое число!");
        int a = scanner.nextInt();
        System.out.println("Пожалуйста введите второе число!");
        int b = scanner.nextInt();
        int result;
        if (a > b ) {
            System.out.println("Данное число больше");
            result = a;
        } else if (a < b) {
            System.out.println("Данное число больше");
            result = b;
        } else {
            System.out.println("Оба числа равны");
            result = 0;
        }
        System.out.println(result);
    }
}
