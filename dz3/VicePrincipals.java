package dz3;

public class VicePrincipals extends Worker {

    public VicePrincipals(String name, String lastName, String pofession) {
        super(name, lastName, pofession);
    }

    @Override
    public void goToWork() {
        System.out.println("Ждут приказы от директора, обрабатывают их и раздают приказы учителе," +
                " Собирают отчеты от учителей!");

    }

    @Override
    public void goToVacation(int days) {
        if (days == 32) {
            System.out.println("У Завучей отпуск 32 дня");
        } else {
            System.out.println("Установлена неверная дата отпуска");
        }
    }
}
