package ua.hillel.shutko.lessons.lesson7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static int countWords(ArrayList<String> WordsArr, String word) {
        return Collections.frequency(WordsArr, word);
    }

    public static void main(String[] args) {

        List<String> WordsArr = new ArrayList<>();
        WordsArr.add("Франция");
        WordsArr.add("Германия");
        WordsArr.add("Монако");
        WordsArr.add("Испания");
        WordsArr.add("Италия");
        WordsArr.add("Австрия");
        WordsArr.add("Испания");
        WordsArr.add("Монако");
        WordsArr.add("Грузия");
        WordsArr.add("Монако");
        WordsArr.add("Испания");
        WordsArr.add("Италия");
        WordsArr.add("Монако");
        WordsArr.add("Сингапур");
        WordsArr.add("Армения");

        System.out.println("Наш массив " + WordsArr);

        for (int i = 0; i < WordsArr.size(); i++) {
            if (countWords((ArrayList<String>) WordsArr, WordsArr.get(i)) == 1) {
                System.out.println(" Уникальные слова " + WordsArr.get(i));
                System.out.println("Слово Испания повторяется " +
                        Collections.frequency(WordsArr, "Испания"));
            }
        }
    }
}

