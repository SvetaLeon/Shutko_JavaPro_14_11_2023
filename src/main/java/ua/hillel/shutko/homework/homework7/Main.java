package ua.hillel.shutko.homework.homework7;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        System.out.println("Method countOccurrence");
        List<String> wordList = new ArrayList<>();
        wordList.add("Cat");
        wordList.add("Dog");
        wordList.add("Wolf");
        wordList.add("Wolf");
        wordList.add("Horse");
        wordList.add("Fox");
        wordList.add("Lion");
        wordList.add("Pig");
        wordList.add("Cow");
        wordList.add("Dog");
        wordList.add("Horse");
        wordList.add("Sheep");
        wordList.add("Fox");
        wordList.add("Wolf");
        wordList.add("Dog");
        countOccurrence(wordList, "Wolf");
        System.out.println();

        System.out.println("Method toList");
        int[] array = {1, 2, 3, 4, 5};
        System.out.println("Array " + Arrays.toString(array));
        toList(array);
        System.out.println();

        System.out.println("Method findUnique");
        List<Integer> integerList = new ArrayList<>(Arrays.asList(1, 5, 1, 3, 9, 4, 7, 8, 3, 2, 0, 7, 6, 2));
        System.out.println("Numeric list " + integerList);
        findUnique(integerList);
        System.out.println();

        calcOccurance(wordList);
    }

    public static void countOccurrence(List<String> list, String word) {
        int counter = 0;
        for (String arrayWord : list) {
            if (arrayWord.equals(word)) {
                counter += 1;
            }
        }
        System.out.println("The specified word occurs " + counter + " times");
    }

    public static void toList(int[] array) {
        List<Integer> arrayList = new ArrayList<>();
        for (Integer i : array) {
            arrayList.add(i);
        }
        System.out.println("List " + arrayList);
    }

    public static void findUnique(List<Integer> list) {
        List<Integer> integerList = new ArrayList<>();
        List<Integer> uniqueNumberList = new ArrayList<>();
        for (int i : list) {
            if ((uniqueNumberList.indexOf(0) == uniqueNumberList.indexOf(i))) {
                uniqueNumberList.add(i);
            } else {
                integerList.add(i);
            }
        }
        Collections.sort(uniqueNumberList);
        uniqueNumberList.removeAll(integerList);
        System.out.println("New list containing only unique numbers " + uniqueNumberList);
    }

    public static void calcOccurance(List<String> list) {
        List<String> array1 = new ArrayList<>();
        List<String> array2 = new ArrayList<>();
        int counter = 0;

        for (String s : list) {
            if ((array1.indexOf(0) == array1.indexOf(s))) {
                array1.add(s);
            } else {
                array2.add(s);
            }
        }
        array1.removeAll(array2);
        System.out.println(array1);
        for (int i = 0; i < array1.size(); i++) {
            System.out.println(array1.get(i) + ": 1");
        }

        System.out.println(array2);
        for (int i = 0; i < array2.size(); i++) {
            System.out.println(array2.get(i) + ": " + counter);
        }
    }
}