package ua.hillel.shutko.homework.homework7;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<String> wordList = new ArrayList<>();
        wordList.add("Cat");
        wordList.add("Dog");
        wordList.add("Wolf");
        wordList.add("Wolf");
        wordList.add("Horse");
        wordList.add("Fox");
        wordList.add("Mouse");
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


}


