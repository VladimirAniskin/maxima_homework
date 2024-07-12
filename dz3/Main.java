package dz3;

public class Main {
    /*/Нужно создать класс dz3.Worker, с полями:
String name; // имя
String lastName; // фамилия
String profession; // профессия
Так же у класса dz3.Worker, есть два метода:
* public void goToWork(); //Метод в котором описана работа.
 Метод, как минимум, должен выводить кто работает, какая у него профессия и как он работает.
 Каждый потомок должен переопределить этот метод (каждая профессия работает по своему)
* public void goToVacation(int days); //Метод в котором описан отпуск.
На вход принимает количество дней отпуска. Метод, как минимум, должен выводить кто уходит в отпуск, какая у него профессия и на сколько дней уходит в отпуск. Каждый потомок должен переопределить этот метод (каждая профессия отдыхает по своему)

Нужно создать минимум четыре класса потомка (профессию выбирайте сами:)),
например - Программист, Тестировщик, СисАдмин, ДевОпс и.т.д.

В классе dz3.Main (в котором создаются объекты всех классов профессий) через полиморфизм вывести отпуск
 и работу каждого объекта
     */
    public static void main(String[] args) {
        Worker worker = new Direktor("Виктор", "Иванов", "Руководитель");
        Worker worker1 = new VicePrincipals("Марина", "Шахова", "Зам. Директора");
        Worker worker2 = new Teasher("Наталья", "Рогожникова", "Учитель");
        Worker worker3 = new Student("Иван", "Сидоров", "Ученеик");

        System.out.println(worker.getPofession() + ": " + worker.getName() + " " + worker.getLastName());
        worker.goToWork();
        worker.goToVacation(28);
        System.out.println(worker1.getPofession() + ": " + worker1.getName() + " " + worker1.getLastName());
        worker1.goToWork();
        worker1.goToVacation(32);
        System.out.println(worker2.getPofession() + ": " + worker2.getName() + " " + worker2.getLastName());
        worker2.goToWork();
        worker2.goToVacation(56);
        System.out.println(worker3.getPofession() + ": " + worker3.getName() + " " + worker3.getLastName());
        worker3.goToWork();
        worker3.goToVacation(90);


    }
}
