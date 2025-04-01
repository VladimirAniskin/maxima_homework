package homework7;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    /*
    1. У вас есть список объектов класса homework7.Person:

public class homework7.Person {
    private String name;
    private int age;
    private String city;

    // Конструкторы, геттеры и сеттеры
}
Создайте список List<homework7.Person> и выполните следующие задания:

Отфильтруйте список, оставив только тех людей, которые старше 18 лет.
Преобразуйте отфильтрованный список в список имен людей.
Отсортируйте список имен в алфавитном порядке.
Соберите результат в List<String>.
2. Используя тот же список объектов homework7.Person, выполните следующие задания:

Подсчитайте количество людей старше 30 лет.
Найдите человека с максимальным возрастом.
Выведите средний возраст людей, проживающих в городе "New York".
     */
    public static void main(String[] args) {
        List<Person> persons = new ArrayList<>();
        persons.add(new Person("Владимир", 35, "New York"));
        persons.add(new Person("Александр", 41, "New York"));
        persons.add(new Person("Сергей", 40, "New York"));
        persons.add(new Person("Алексей", 3, "New York"));
        persons.add(new Person("Елена", 30, "New York"));
        persons.add(new Person("Александра", 29, "New York"));
        persons.add(new Person("Стефаня", 24, "New York"));
        persons.add(new Person("Аделина", 39, "New York"));
        persons.add(new Person("Екатерина", 76, "New York"));
        persons.add(new Person("Лариса", 50, "New York"));

        List<String> rezult = persons.stream()
                .filter(person -> person.getAge() > 18)
                .map(Person::getName).sorted().collect(Collectors.toList());
        System.out.println(rezult);

        long count = persons.stream()
                .filter(person -> person.getAge() > 30).count();
        System.out.println("количество людей старше 30 лет - " + count + " человек");

        String rezult2 = persons.stream()
                .max(Comparator.comparingInt(Person::getAge))
                .map(Person::toString).orElse(null);
        System.out.println("Самый старый человек в этом городе -  " + rezult2);

        IntSummaryStatistics rezult3 = persons.stream()
                .map(Person::getAge)
                .mapToInt(Integer::intValue)
                .summaryStatistics();
        System.out.println("Средний возраст - " + rezult3.getAverage());


    }
}
