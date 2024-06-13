import java.util.Random;
import java.util.Scanner;

public class rondom {
    public static void main(String[] args) {
        /*/
        Напишите программу, которая случайным образом загадывает число от 1 до 100.
        Вот код, который генерирует случайное число от 1 до 100:
         Random random = new Random();
         int randomNumber = random.nextInt(100) + 1;
         Пользователь должен угадать это число, вводя свои варианты.
         Программа должна указывать, больше или меньше введённое число по сравнению с загаданным,
         пока пользователь не угадает.
         */
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int randomNumber = random.nextInt(100) + 1;
        System.out.println("Здавствуйте мы вас приветсвем в игре угадай число или получи миллон щелбанов и так " +
                "Мы начинаем");
        System.out.println("Введите желаемое количество попыток");

        int namber2 = scanner.nextInt();
        System.out.println("Введите ваше число");
        int namber1 = scanner.nextInt();
        for (int i = 0; i < namber2; i++) {
            if (namber1 < randomNumber) {
                System.out.println("Ваше введеное число меньше загадонного, Введите другое число");
                namber1 = scanner.nextInt();
            } else if (namber1 > randomNumber) {
                System.out.println("Ваше введеное число ,больше загадонного. Введите другое число");
                namber1 = scanner.nextInt();
            } else {
                System.out.println("Поздравляем вы угадали");
                break;
            }
        }System.out.println("Вы использовали все попытки");


    }
}
