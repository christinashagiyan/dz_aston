package dz2;

import java.util.Comparator;
import java.util.List;

public class MyListsTest {
    public static void main(String[] args) {

        System.out.println("\n---- Тестирование MyArrayList ----");

        MyList<Integer> a_list_1 = new MyArrayList<>();
        MyList<Integer> a_list_2 = new MyArrayList<>(List.of(6,9,7,8));
        System.out.println("Создание списка с помощью коллекции: " + a_list_2);
        for (int i = 0; i < 5; i++) {
            a_list_1.add(i);
        }
        System.out.println("Добавление элемента в конец: " + a_list_1);
        a_list_2.add(0,0);
        System.out.println("Добавление элемента в начало: " + a_list_2);
        a_list_2.add(2,2);
        System.out.println("Добавление элемента в \"середину\": " + a_list_2);
        a_list_1.addAll(List.of(20,52));
        System.out.println("Добавление элементов коллекции в конец: " + a_list_1);
        a_list_1.addAll(0, List.of(7,7,2024));
        System.out.println("Добавление элементов коллекции в начало: " + a_list_1);
        a_list_2.addAll(3, List.of(3, 33, 333));
        System.out.println("Добавление элементов коллекции в \"середину\": " + a_list_2);
        System.out.println("Получение элемента по индексу: " + a_list_1.get(2));
        a_list_1.set(2,24);
        System.out.println("Изменение элемента по индексу: " + a_list_1.get(2));
        a_list_1.remove(2);
        System.out.println("Удаление элемента по индексу: " + a_list_1);
        a_list_2.remove(Integer.valueOf(333));
        System.out.println("Удаление элемента по значению: " + a_list_2);
        a_list_1.sort(Integer::compareTo);
        System.out.println("Нестатический метод сортировки: " + a_list_1);
        MyList.sort(a_list_2, Comparator.reverseOrder());
        System.out.println("Статический метод сортировки: " + a_list_2);
        System.out.println("Получение размера списка: " + a_list_2.size());


        System.out.println("\n---- Тестирование MyLinkedList ----");

        MyLinkedList<String> l_list_1 = new MyLinkedList<>();
        MyLinkedList<String> l_list_2 = new MyLinkedList<>(List.of("Дождь","Ливень"));
        System.out.println("Создание списка с помощью коллекции: " + l_list_2);
        for (int i = 0; i < 5; i++) {
            l_list_1.add("строка"+i);
        }
        System.out.println("Добавление элемента в конец: " + l_list_1);
        l_list_2.addLast("Ночь");
        System.out.println("Добавление элемента в конец с помощью addLast: " + l_list_2);
        l_list_2.addFirst("День");
        System.out.println("Добавление элемента в начало с помощью addFirst: " + l_list_2);
        l_list_2.add(2,"Вечер");
        System.out.println("Добавление элемента в \"середину\": " + l_list_2);
        l_list_2.addAll(List.of("ааааааааааа","ббббббббб"));
        System.out.println("Добавление элементов коллекции в конец: " + l_list_2);
        l_list_2.addAll(0, List.of("вв","г"));
        System.out.println("Добавление элементов коллекции в начало: " + l_list_2);
        l_list_2.addAll(3, List.of("ддддддд","йц"));
        System.out.println("Добавление элементов коллекции в \"середину\": " + l_list_2);
        System.out.println("Получение элемента по индексу: " + l_list_1.get(3));
        System.out.println("Получение первого элемента: " + l_list_1.getFirst());
        System.out.println("Получение последнего элемента: " + l_list_1.getLast());
        l_list_1.set(2, "Строка2");
        System.out.println("Изменение элемента по индексу: " + l_list_1.get(2));
        l_list_1.remove(3);
        System.out.println("Удаление элемента по индексу: " + l_list_1);
        l_list_2.remove("Дождь");
        System.out.println("Удаление элемента по значению: " + l_list_2);
        l_list_2.sort(String::compareToIgnoreCase);
        System.out.println("Нестатический метод сортировки: " + l_list_2);
        MyList.sort(l_list_2, Comparator.comparing(String::length));
        System.out.println("Статический метод сортировки: " + l_list_2);
        System.out.println("Получение размера списка: " + l_list_1.size());
    }
}
