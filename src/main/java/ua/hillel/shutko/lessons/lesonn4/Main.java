package ua.hillel.shutko.lessons.lesonn4;

import java.nio.charset.StandardCharsets;

public class Main {
    public static void main(String[] args) {

        // method StringBuilder
        StringBuilder builder = new StringBuilder();
        builder.append("Hello");
        builder.append(" ");
        builder.append("World");
        builder.append(" ");
        builder.append("!");

        String result = builder.toString();
        System.out.println(result);

        // method String.format (використовується для формування message чи error)
        String template = "Hello %s my name is: %s, and my age is %d";
        String myString = String.format(template, "Bob", "Alice", 22);
        System.out.println(myString);

        // перетворення байта в рядок
        String rawString = "Entwickeln Sie mit Vergnügen";
        byte[] bytes = rawString.getBytes(StandardCharsets.UTF_8);
        String utf8EncodedString = new String(bytes, StandardCharsets.UTF_8);
        System.out.println(utf8EncodedString);

        // indexOf
        findSymbol("Hello", 'l');

        String str = "Diego, where is my money? Diego,you made me very upset";
        int value = str.indexOf("where");
        System.out.println("Index " + value);

        String str1 = "Diego, where is my money? Diego,you made me very upset";
        int value1 = str.indexOf("Diego", 1);
        System.out.println("Index " + value1);

        String str2 = "Diego, where is my money?";
        int value2 = str.indexOf('e', 5);
        System.out.println("Index " + value2);

        String str3 = "Diego, where is my money?";
        int value3 = str.indexOf(101, 5);
        System.out.println("Index " + value3);

        // charAt
        String textString = "Never look back";
        int count = 0;
        for (int i = 0; i <= textString.length() - 1; i++) {
            if (textString.charAt(i) == 'k') {
                count++;
            }
        }
        System.out.println("Frequency of t is: " + count);

        String name = "javatpoint";
        char ch = name.charAt(4);//returns the char value at the 4th index
        System.out.println(ch);
        System.out.print("JavaBasic".charAt(0));
        System.out.print("JavaBasic".charAt(1));
        System.out.print("JavaBasic".charAt(2));
        System.out.print("JavaBasic".charAt(3));
        System.out.println();

        // toCharArray
        String str4 = "Hello";
        char[] result4 = str4.toCharArray();
        System.out.println("Char array:");
        for (int i = 0; i < result4.length; i++)
            System.out.println("Element [" + i + "]: " + result4[i]);


        // intern
        String s1 = new String("hello");
        String s2 = "hello";
        String s3 = s1.intern();//повертає рядок з пулу, тепер він буде таким, як s2
        System.out.println(s1 == s2);//false тому що референсні змінні вказують на різні екземпляри
        System.out.println(s2 == s3);//true тому що референсні змінні вказують на один і той самий екземпляр

        // contains
        String str_Sample = "This is a String contains Example";
        //Check if String contains a sequence
        System.out.println("Contains sequence 'ing': " + str_Sample.contains("ing"));
        System.out.println("Contains sequence 'Example': " + str_Sample.contains("Example"));
        System.out.println("Contains sequence 'example': " + str_Sample.contains("example"));
        System.out.println("Contains sequence 'is String': " + str_Sample.contains("is String"));


        //startWith
        String line = "java string split method by javatpoint";
        System.out.println(line.startsWith("ja"));  // true
        System.out.println(line.startsWith("java string"));   // true
        System.out.println(line.startsWith("Java string"));  // false as 'j' and 'J' are different

        //valueOf
        char ch1 = 'A';
        char ch2 = 'B';
        String ss1 = String.valueOf(ch1);
        String ss2 = String.valueOf(ch2);
        System.out.println(ss1);
        System.out.println(ss2);

        System.out.println(reverseString("Hello"));
        isPalindrome("ERE");
        isPalindrome("Allo");
    }

    static void findSymbol(String findSymbol, char symbol) {
        int value = findSymbol.indexOf(symbol);
        System.out.println("Word: " + findSymbol);
        System.out.println("Character: " + symbol);
        System.out.println("Index " + value);
    }

//    public static String reverseString(String str) {
//        char[] array = str.toCharArray();
//        String result = "";
//        for (int i = array.length - 1; i >= 0; i--) {
//            result += array[i];
//        }
//        return result;
//    }

    public static String reverseString(String str) {
        return new StringBuilder(str).reverse().toString();
    }

    static void isPalindrome(String enterTheString){
        String result = new StringBuilder(enterTheString).reverse().toString();
        System.out.println(enterTheString + " -> " + enterTheString.equals(result));
    }

}
