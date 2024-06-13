package src;

import java.util.Scanner;

public class maximum_of_three_numbers {
    public static void main(String[] args) {
        /*Напишите метод maxOfThree,
         который принимает три целых числа и возвращает наибольшее из них.
          Используйте условный оператор if.
                 */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число");
        int a = scanner.nextInt();
        System.out.println("Введите число");
        int b = scanner.nextInt();
        System.out.println("Введите число");
        int c = scanner.nextInt();
        int rezault = maxOfThree(a,b,c);
        rezault = maxOfThree(a,b,c);
       System.out.println("Наибольшее число = " + rezault);


    }

    public static int maxOfThree(int a, int b, int c) {
        if (a > b && a > c) {
           return a;
        } else if (b > c && b > a) {
           return b;

        } else {
           return c;
        }
    }
}
