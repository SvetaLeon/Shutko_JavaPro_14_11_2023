package ua.hillel.shutko.homework;

public class Main {
    public static void main(String[] args) {
        findSymbolOccurrence("Never look back", 'k');
        System.out.println();

        findWordPosition("Apollo", "pollo");
        System.out.println();
        findWordPosition("Apple", "Plant");
        System.out.println();
        findWordPosition("Pineapple", "apple");
        System.out.println();

        stringReverse("Hello");
        System.out.println();

        isPalindrome("ERE");
        isPalindrome("Allo");


    }

    static void findSymbolOccurrence(String enterTheString, char enterThesymbol) {
        char[] charArray = enterTheString.toCharArray();
        int counter = 0;
        for (char c : charArray) {
            if (c == enterThesymbol) {
                counter += 1;
            }
        }
        System.out.println("Number of matching characters " + counter);
    }

    // method findSymbolOccurrence version two
//    static void findSymbolOccurrence(String enterTheString, char enterThesymbol) {
//        int counter = 0;
//        for (int i = 0; i <= enterTheString.length() - 1; i++) {
//            if (enterTheString.charAt(i) == enterThesymbol) {
//                counter++;
//            }
//        }
//        System.out.println("Number of matching characters " + counter);
//    }

    static void findWordPosition(String source, String target) {
        System.out.println("Source: " + source);
        System.out.println("Target: " + target);
        if (source.contains(target)) {
            System.out.println("Result: " + source.indexOf(target));
        } else {
            System.out.println("Result: -1");
        }
    }

    static void stringReverse(String enterTheString) {
        char[] charArray = enterTheString.toCharArray();
        String result = "";
        for (int i = charArray.length - 1; i >= 0; i--) {
            result += charArray[i];
        }
        System.out.println(enterTheString + " -> " + result);
    }

    static void isPalindrome(String enterTheString){
        char[] charArray = enterTheString.toCharArray();
        String result = "";
        for (int i = charArray.length - 1; i >= 0; i--) {
            result += charArray[i];
        }
        System.out.println(enterTheString + " -> " + enterTheString.equals(result));
    }
}
