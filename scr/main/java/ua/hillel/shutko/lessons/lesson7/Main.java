package ua.hillel.shutko.lessons.lesson7;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(); //Створення списку масивів
        list.add("Mango"); //Додавання об'єкта в масив
        list.add("Apple");
        list.add("Banana");
        list.add("Grapes");

        //Перебір списку через ітератор
        Iterator<String> itr = list.iterator(); //отримати Ітератор
        while (itr.hasNext()) { //перевірити, чи є в ітераторі елементи
            System.out.println(itr.next()); //друкуємо елемент і переходимо до наступного
        }

        System.out.println("#######");
        //Перебір списку через цикл for-each
        for (String s : list) {
            System.out.println(s);
        }

        System.out.println("#######");
        //Сортування списку
        Collections.sort(list);
        //Перебір списку через цикл for-each
        for (String c : list)
            System.out.println(c);

        System.out.println("#######");
        //звернення до елемента
        System.out.println("Returning element: " + list.get(1)); //поверне 2-й елемент, оскільки індекс починається з 0
        //заміна елемента
        list.set(1, "Dates");
        //Перебір списку через цикл for-each
        for (String l : list)
            System.out.println(l);

        System.out.println("#######");
        List<Integer> list2 = new ArrayList<>();
        list2.add(21);
        list2.add(11);
        list2.add(51);
        list2.add(1);
        Collections.sort(list2);
        for (Integer number : list2)
            System.out.println(number);

        System.out.println("#######");
        List fruits = new ArrayList<>();
        fruits.add("Apple");    // додаємо "Apple" до списку
        fruits.add("Banana");   // додаємо "Banana" до списку
        System.out.println(fruits.size());  // друкуємо розмір списку (2)
        System.out.println(fruits.get(0));  // друкуємо перший елемент списку ("Apple")
        fruits.set(0, "Peach");  // замінюємо перший елемент списку на "Peach"
        System.out.println(fruits);
        fruits.remove(1);  // видаляємо другий елемент списку
        System.out.println(fruits);
        System.out.println(fruits.contains("Banana"));  // повертаємо false, тому що "Banana" було видалено

        System.out.println("#######");
        List<String> animals = new LinkedList<>();
        animals.add("Dog");
        ((LinkedList<String>) animals).addFirst("Cat");
        ((LinkedList<String>) animals).addLast("Bird");

        System.out.println(((LinkedList<String>) animals).getFirst()); // виводить "Cat"
        System.out.println(((LinkedList<String>) animals).getLast()); // виводить "Bird"

        ((LinkedList<String>) animals).removeFirst(); // видаляє "Cat"
        ((LinkedList<String>) animals).removeLast(); // видаляє "Bird"

        System.out.println(((LinkedList<String>) animals).getFirst()); // виводить "Dog", оскільки "Dog" зараз єдиний елемент у списку

        System.out.println("#######");
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        ListIterator iterator = numbers.listIterator();

        System.out.println("Iterating in forward direction: ");
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println();

        System.out.println("Iterating in backward direction: ");
        while (iterator.hasPrevious()) {
            System.out.println(iterator.previous());
        }

        System.out.println("#######");
        List<Integer> numList = new ArrayList<>();
        numList.add(51);
        numList.add(14);
        numList.add(11);
        numList.add(12);
        numList.add(31);
        numList.add(21);

        System.out.println("Оригинал: " + numList);

        numList.removeIf(i -> (i > 10 && i < 20)); // удаляем элементы, которые больше 10 и меньше 20

        System.out.println("Новый список: " + numList);


        System.out.println("#######");
        List<Integer> numbersList = new ArrayList<>(Arrays.asList(1, 5, 1, 3, 7, 3, 2, 7, 2));
        Collections.sort(numbersList);
        System.out.println(numbersList);
        List<Integer> uniqueNumbersList = numbersList.stream().distinct().collect(Collectors.toList());
        Collections.sort(uniqueNumbersList);
        System.out.println(uniqueNumbersList);
    }

}
