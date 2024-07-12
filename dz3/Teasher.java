package dz3;

public class Teasher extends Worker {
    public Teasher(String name, String lastName, String pofession) {
        super(name, lastName, pofession);
    }

    @Override
    public void goToWork() {
        System.out.println("Ведут Уроки, Выполняют задачи завучей," +
                " ставят задачи ученикам,ждут отчеты от учениов!");

    }

    @Override
    public void goToVacation(int days) {
        if (days == 56) {
            System.out.println("У учителя отпуск 56 дней");
        } else {
            System.out.println("Установлена неверная дата отпуска");
        }
    }
}
