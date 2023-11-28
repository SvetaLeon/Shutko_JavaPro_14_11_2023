package ua.hillel.shutko.homework;

public class Main {
    public static void main(String[] args) {
        findSymbolOccurrence("Hello World!", 'l');
    }

    static void findSymbolOccurrence(String textString, char symbol) {
        char[] conversionToSymbol = textString.toCharArray();
        int counter = 0;
        for (char c : conversionToSymbol) {
            if (c == symbol) {
                counter += 1;
            }
        }
        System.out.println("Number of matching characters " + counter);
    }
}
