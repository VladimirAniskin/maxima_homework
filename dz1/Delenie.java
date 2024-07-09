package dz1;

import java.util.Scanner;

public class Delenie {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Пожалуйста введите первое число!");
        double a = scanner.nextDouble();
        System.out.println("Пожалуйста введите второе число!");
        double b = scanner.nextDouble();
        double result;
        if ( a < b ) {
            result = b / a;
        }else {
            result = a / b;
        }
        System.out.println("Ответ: " + result);
    }
}
