package BubbleSort;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        int[] array1 = {9, 3, 5, 2, -4};
        bubbleSort(array1);
        System.out.println(Arrays.toString(array1));
    }

    public static void bubbleSort(int[] array) {
        boolean sorted = false;
        int temp;
        while (!sorted) {
            sorted = true;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    sorted = false;
                }
            }
        }
    }
}