package dz2;

import java.util.Scanner;

public class Checking_for_a_prime_number {
    public static void main(String[] args) {
        /*Напишите метод isPrime, который принимает целое число и возвращает true,
         если число простое, и false в противном случае.
         Используйте цикл for и условный оператор if.
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число");
        int namber = scanner.nextInt();
        boolean rezult= isPrime(namber);
        rezult = isPrime(namber);
        System.out.println(rezult);


    }
    public static boolean isPrime (int namber) {
        if (namber <= 1) {
            return false;


        }
        for (int i = 2; i * i <= namber; i++) {
            if (namber % i == 0) {
                return false;
            }
        }
        return true;
    }
}
