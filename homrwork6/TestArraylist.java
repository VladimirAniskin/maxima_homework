package homrwork6;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class TestArraylist {
    public static <Interator> void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Владимир");
        list.add("Олег");
        list.add("Сергей");
        list.add("Иван");
        list.add("Тимур");
        list.add("Алексей");
        list.add("Александр");
        list.add("Слятослав");
        list.add("Егор");
        list.add("Георгий");
        list.remove(5);
        list.add(5, "Дмитрий");
        if (list.contains("Иван") == true) {
            System.out.println("Мы нашли тебя Иван");
        } else {
            System.out.println(" Данный индивидум отсуттсвует в списке");
        }
        System.out.println("Под индексом 9 находиться эта личность: " + list.get(9));
        list.add(4, "Тарас");
        Iterator<String> interator = list.iterator();
        while (interator.hasNext()) {
            System.out.println(interator.next());
            System.out.println("Данное имя в списике");
        }
        System.out.println("Вывод с 5 по 9 элемент:");
        for (int i = 5; i < 10; i++) {
            System.out.println(list.get(i));
        }
        ArrayList<String> list1 = new ArrayList<>();
        list1.addAll(list);
        list1.add("Евгения");
        list1.add("Татьяна");
        list1.add("Алёна");
        list1.add("Марьяна");
        System.out.println("Имена во втором Массиве:");
        for (int i = 0; i < list1.size(); i++) {
            System.out.println(list1.get(i));
        }
        list1.clear();  // удаленение данного списка

        LinkedList<String> list3 = new LinkedList<>();
        list3.add("Ростов-на-Дону");
        list3.add("Казань");
        list3.add("Москва");
        list3.add("Азов");
        list3.add("Волгоград");
        list3.add("Санкт-Петербугр");
        list3.add("Сочи");
        list3.add("Новоросийск");
        list3.add("Ялта");
        list3.add("Новый-Афон");
        list3.addFirst("Припять");
        list3.addFirst("Гуамка");
        list3.addFirst("Майкоп");
        list3.addFirst("Липецк");
        list3.addFirst("Нурлат");
        System.out.println("Добавили 5 городов в начале");
        for (int i = 0; i < list3.size(); i++) {
            System.out.println(list3.get(i));
        }
        list3.addLast("Самара");
        list3.addLast("Екатеренбург");
        list3.addLast("Воронеж");
        list3.addLast("Сызрань");
        list3.addLast("Уфа");
        System.out.println("Добавили 5 городов в конце");
        for (int i = 0; i < list3.size(); i++) {
            System.out.println(list3.get(i));
        }
        System.out.println("Удаляем  3 города в начале");
        for (int i = 0; i < 3; i++) {
            list3.removeFirst();
        }
        System.out.println("после 3 удаленных городов в начале");
        for (int i = 0; i < list3.size(); i++) {
            System.out.println(list3.get(i));
        }
        System.out.println("Удаляем  4 города в конце");
        for (int i = 0; i < 4; i++) {
            list3.removeLast();
        }
        System.out.println("после 4 удаленных городов в конце");
        for (int i = 0; i < list3.size(); i++) {
            System.out.println(list3.get(i));
        }
        System.out.println("Работа выполнена Урааа");
    }
}
