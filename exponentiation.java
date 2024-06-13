import java.util.Scanner;

public class exponentiation {
    public static void main(String[] args) {
        /*/Напишите метод power, который принимает два целых числа base и exponent,
         и возвращает результат возведения base в степень exponent. Используйте цикл for.
                 */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число которое нужно возвести в степень");
        int base = scanner.nextInt();
        System.out.println("Введите число которое является спепенью введеного числа");
        int exponent = scanner.nextInt();
        int rezult = power(base, exponent);
        System.out.println("результат возведения в степень = " + rezult);

    }

    public static int power(int base, int exponent) {
        int rezult = 1;
        for (int i = 0; i < exponent; i++) {
            rezult = rezult * base;
        }
        return rezult;


    }
}

