package javaRush;

import java.util.Arrays;

public class ArraysBinarySearch {
    public static void main(String[] args) {
        int[] array = {1, 3, 5, 7, 9, 11, 13};

        int elementToFind = 5;
        boolean isElementPresent = binarySearch(array, elementToFind);

        System.out.println(isElementPresent);
    }

    public static boolean binarySearch(int[] array, int elementToFind) {
        int index = Arrays.binarySearch(array, elementToFind);

        return index >= 0;
    }
}


