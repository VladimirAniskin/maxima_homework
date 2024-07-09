package dz2;

import java.util.Scanner;

public class n_array_of_positive_numbers {
    /*
Напишите программу, которая запрашивает у пользователя 10 чисел и сохраняет их в массив.
 Программа должна затем вывести только положительные числа из этого массива.
  Используйте цикл for и условный оператор if.
 */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int [10];
        for (int i = 0; i < 10; i++) {
            System.out.println("Введите число " + i);
            array[i] = scanner.nextInt();
            if (array[i] > 0) {
                System.out.println("это число положительное " + array[i]);

            } else {
                System.out.println("Вы ввели отрицателльное число");
            }
        }

    }
}
