import java.util.Scanner;

public class Fibonacci {
    /*/Напишите метод fibonacci,
     который принимает целое число n и возвращает n-ое число Фибоначчи.
     Используйте рекурсию.

     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число");
        int n = scanner.nextInt();
        int rezult = fibonacci (n);
        System.out.println("Число Фобиначчи = " + rezult);
    }

    public static int fibonacci(int n ) {
        if (n <= 1) {
            return 0;
        } else if (n == 2) {
            return 1;
        } else {
            int rezult = fibonacci(n - 1) + fibonacci(n - 2);
            return rezult;
        }
    }
}
