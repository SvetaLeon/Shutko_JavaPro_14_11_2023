package ua.hillel.shutko.homework.homework5;

public class ArrayValueCalculator {

    public static void doCalc(String[][] array) {
        int result = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array.length == 4 || array[i].length == 4) {
                    try {
                        result += Integer.parseInt(array[i][j]);
                    } catch (Exception e) {
                        System.out.println("ArrayDataException");
                        System.out.println("Incorrect array's data : " + i + " - " + j);
                    }
                }
                if (array.length != 4 || array[i].length != 4) {
                    try {

                    } catch (Exception e) {
                        System.out.println("ArraySizeException");
                        System.out.println("Make matrix size 4x4");
                    }
                }
            }
        }
        System.out.println(result);
    }

    public static void main(String[] args) {
        String[][] array = {{"10", "10", "10", "10"},
                {"10", "10", "10", "10"},
                {"10", "10", "10", "10"},
                {"10", "10", "10"}
        };

        doCalc(array);
    }
}

