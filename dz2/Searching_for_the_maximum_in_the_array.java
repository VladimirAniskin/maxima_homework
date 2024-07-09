package dz2;

import java.util.Scanner;

public class Searching_for_the_maximum_in_the_array {
    /*Напишите программу, которая запрашивает у пользователя 5 чисел,
     сохраняет их в массив и находит максимальное число в этом массиве.
      Используйте цикл for и условный оператор if.
    /
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] array1 = new int[5];
        int max = array1[0];
        for (int i = 0; i < array1.length; i++) {
            System.out.println("Введите число " + i);
            array1[i] = scanner.nextInt();
            if (array1[i] > max) {
                max = array1[i];
            }

        }
        System.out.println(" Максимальное число = " + max);
    }
}