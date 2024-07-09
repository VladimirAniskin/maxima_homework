package dz1;

import java.util.Scanner;

public class SummAndUmnojenie {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Пожалуйста введите первое число!");
        int a = scanner.nextInt();
        System.out.println("Пожалуйста введите второе число!");
        int b = scanner.nextInt();
        int result;
        if ( a < 0 || b < 0 ) {
            System.out.println("Я не работаю с отрицательными числами");
            result = 0;
    }  else if ( a < b ) {
            System.out.println("Если " + a +" меньше " + b + " ,то а умножим на " + b );
            result = a * b;
        }else {
            System.out.println("В остальных случаях сложить оба числа");
            result = a + b;

        } System.out.println("Ответ: " + result);

        }

    }
