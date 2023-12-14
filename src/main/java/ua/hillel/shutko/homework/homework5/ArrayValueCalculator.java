package ua.hillel.shutko.homework.homework5;

public class ArrayValueCalculator {
    public static void doCalc(String[][] array) throws ArraySizeException, ArrayDataException {
        int result = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array.length == 4 && array[i].length == 4) {
                    try {
                        result += Integer.parseInt(array[i][j]);
                    } catch (Exception e) {
                        throw new ArrayDataException("Wrong data in cell: row " + i + " column " + j);
                    }
                } else {
                    throw new ArraySizeException("The array should have a size of 4x4");
                }
            }
        }
        System.out.println("Sum of array elements: " + result);
    }

    public static void main(String[] args) {
        String[][] array1 = {{"1", "1", "1", "1"},
                {"1", "1", "1", "1"},
                {"1", "1", "1", "1"},
                {"1", "1", "1", "1"}
        };

        String[][] array2 = {{"l", "1", "1", "1"},
                {"1", "1", "1", "1"},
                {"1", "1", "1", "1"},
                {"1", "1", "1", "1"}
        };

        String[][] array3 = {{"1", "1", "1", "1"},
                {"1", "1", "1", "1"},
                {"1", "1", "1"},
                {"1", "1", "1", "1"}
        };

        try {
            doCalc(array1);
        } catch (ArraySizeException | ArrayDataException e) {
            e.printStackTrace();
        }

        try {
            doCalc(array2);
        } catch (ArraySizeException | ArrayDataException e) {
            e.printStackTrace();
        }

        try {
            doCalc(array3);
        } catch (ArraySizeException | ArrayDataException e) {
            e.printStackTrace();
        }
    }
}
