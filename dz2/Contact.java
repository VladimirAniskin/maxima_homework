package dz2;

import java.util.Scanner;

public class Contact {
    /*/Напишите метод contains, который принимает массив целых чисел и целое число target,
    и возвращает true, если массив содержит это число, и false в противном случае.
    Используйте цикл for.
         */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Введите количество цифр в массиве");
        int namber = scanner.nextInt();
        System.out.println(" Введите искомое число в массиве");
        int target = scanner.nextInt();
        boolean rezult = Contact(namber, target);
        System.out.println("Искомое число = " + rezult);

    }

    public static boolean Contact(int namber, int target) {
        Scanner scanner = new Scanner(System.in);
        int[] array1 = new int[namber];
        for (int i = 0; i < array1.length; i++) {
            System.out.println("Введите число " + i);
            array1[i] = scanner.nextInt();
            if (array1[i] == target) {
                return true;
            }
        } return false;
    }
}
