package ua.hillel.shutko.homework.homework7;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        System.out.println("Method countOccurrence");
        List<String> wordList = new ArrayList<>();
        wordList.add("Cat");
        wordList.add("Fox");
        wordList.add("Lion");
        wordList.add("Horse");
        wordList.add("Dog");
        wordList.add("Cow");
        wordList.add("Wolf");
        wordList.add("Lion");
        wordList.add("Horse");
        wordList.add("Fox");
        wordList.add("Wolf");
        wordList.add("Pig");
        wordList.add("Dog");
        wordList.add("Sheep");
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

        System.out.println("Method calcOccurrence");
        System.out.println(wordList);
        calcOccurrence(wordList);
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

    public static void calcOccurrence(List<String> list) {
        List<String> listWords = new ArrayList<>();
        List<String> repeatedWords = new ArrayList<>();
        List<String> uniqueWords = new ArrayList<>();
        for (String word : list) {
            if ((uniqueWords.indexOf(0) == uniqueWords.indexOf(word))) {
                uniqueWords.add(word);
            } else {
                repeatedWords.add(word);
            }
        }
        uniqueWords.removeAll(repeatedWords);
        listWords.addAll(uniqueWords);
        for (String word : repeatedWords) {
            if ((listWords.indexOf(0) == listWords.indexOf(word))) {
                listWords.add(word);
            }
        }
        for (String word : listWords) {
            System.out.println(word + ": " + Collections.frequency(list, word));
        }
    }
}