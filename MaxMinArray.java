import java.util.Scanner;

public class MaxMinArray {
    /*/
    Напишите метод minMax, который принимает массив целых чисел и
    возвращает массив из двух элементов: минимального и максимального
    значений в данном массиве.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Введите количество цифр в массиве");
        int namber2 = scanner.nextInt();
        int[] array1 = new int[namber2];
        for (int i = 0; i < array1.length; i++) {
            System.out.println("Введите число " + i);
            array1[i] = scanner.nextInt();
        }
        System.out.println("Ваше максимальное значение " + minMax(array1)[0]);
        System.out.println("Ваше минимальное значение " +  minMax(array1)[1]);
    }

    public static int[] minMax(int[] array1) {
        Scanner scanner = new Scanner(System.in);
        int min = array1[0];
        int max = array1[0];
        for (int i = 0; i < array1.length; i++) {
            if (min > array1[i]) {
                min = array1[i];
            }
            if (max < array1[i]) {
                max = array1[i];
            }
        }
        int[] array = {max, min};
        return array;

    }
}
