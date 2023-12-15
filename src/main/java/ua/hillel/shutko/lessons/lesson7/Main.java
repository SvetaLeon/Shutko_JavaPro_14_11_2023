package ua.hillel.shutko.lessons.lesson7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

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
    }
}
