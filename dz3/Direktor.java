package dz3;

public class Direktor extends Worker {

    public Direktor(String name, String lastName, String pofession) {
        super(name, lastName, pofession);

    }

    @Override
    public void goToWork() {
        System.out.println("Начальник, раздает приказы! Ждет отчеты от Завучей!");
    }

    @Override
    public void goToVacation(int days) {
        if (days == 28) {
            System.out.println("Отпуск у директора 28 дней");
        } else {
            System.out.println("Установлена неверная дата отпуска");
        }
    }
}
