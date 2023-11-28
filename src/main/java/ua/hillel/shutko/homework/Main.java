package ua.hillel.shutko.homework;

public class Main {
    public static void main(String[] args) {
        findSymbolOccurrence("Hello World!", 'l');
        System.out.println();

        findWordPosition("Apollo", "pollo");
        System.out.println();
        findWordPosition("Apple", "Plant");
        System.out.println();
        findWordPosition("Pineapple", "apple");

    }

    static void findSymbolOccurrence(String textString, char symbol) {
        char[] charArray = textString.toCharArray();
        int counter = 0;
        for (char c : charArray) {
            if (c == symbol) {
                counter += 1;
            }
        }
        System.out.println("Number of matching characters " + counter);
    }

    static void findWordPosition(String source, String target) {
        System.out.println("Source: " + source);
        System.out.println("Target: " + target);
        if (source.contains(target)) {
            int indexElement = source.indexOf(target);
            System.out.println("Result: " + indexElement);
        } else {
            System.out.println("Result: -1");
        }
    }


}
