package dz2;

import java.util.Scanner;

public class For {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Пожалуйста введите первое число!");
        int a = scanner.nextInt();
        System.out.println("Пожалуйста введите второе число!");
        int b = scanner.nextInt();
        if (a < b ) {
            while ( a < b ){
                System.out.println(a);
                a = a + 1 ;
            }
            System.out.println(a);
            System.out.println("Ваш искомый диапазон");
        } else if (a > b ) {
            while (a > b) {
                System.out.println(a);
                a = a - 1;
            } System.out.println(a);
            System.out.println("Ваш искомый диапазон");
        }else {
            System.out.println(" Введены неверные значения");
        }

    }
}
