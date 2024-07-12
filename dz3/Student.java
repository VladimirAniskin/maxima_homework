package dz3;

public class Student extends Worker {

    public Student(String name, String lastName, String pofession) {
        super(name, lastName, pofession);
    }

    public void goToWork() {
        System.out.println("Внимательно работают на урох и здают отчеты учителям!");
    }

    @Override
    public void goToVacation(int days) {
        if (days == 90) {
            System.out.println("У учеников отпуск 90 дней");
        } else {
            System.out.println("Установлена неверная дата отпуска");
        }
    }
}
