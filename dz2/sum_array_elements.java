package dz2;

import java.util.Scanner;

public class sum_array_elements {
    public static void main(String[] args) {
/*Напишите метод sumArray, который принимает массив целых чисел и возвращает
 сумму его элементов. Используйте цикл for.
/
 */

        int rezult = sumArray ();
        System.out.println(rezult);

    }
    public static int sumArray (){
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        System.out.println("Введите колисество складывемых чисел");
        int length = scanner.nextInt();
        int [] arrayNamber = new int [length];
        for (int i = 0; i < arrayNamber.length; i++){
            System.out.println("Введите число " + i );
              arrayNamber [i] = scanner.nextInt();
               sum = sum +arrayNamber [i];



        }return sum;


    }

}
