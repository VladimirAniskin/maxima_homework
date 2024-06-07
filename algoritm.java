import java.util.Scanner;

public class algoritm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Пожалуйста введите первое число!");
        double a = scanner.nextDouble();
        System.out.println("Пожалуйста введите второе число!");
        double b = scanner.nextDouble();
        double c = a + b;
        System.out.println("Сумма чисел равна: " + c);
        double d = a - b;
        System.out.println("Разность чисел равна: " + d);
        double f = a * b;
        System.out.println("Результат умножения чисел равна: " + f);
        double w = a / b;
        System.out.println("Результат деления чисел равна: " + w);
        }
}
