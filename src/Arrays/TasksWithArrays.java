package Arrays;

import java.util.Arrays;

public class TasksWithArrays {
    public static void main(String[] args) {
        // Tasks with arrays.
        // Задачи с массивами.
        // Task 1. Show 3 first elements of the array using "for" cycle.
        // Задача 1. Вывести первые 3 элемента массива (Вывести первые 3 элемента массива
        // используя цикл for).

        int[] nums1 = {7, -3, 9, -11, 18, 99, 2, 11};
        System.out.println("Task 1");
        System.out.println("Original array: " + Arrays.toString(nums1));
        System.out.print("First 3 elements:");
        int count = 3;

        for (int i = 0; i < count; i++) {
            System.out.print(" " + nums1[i]);
        }
        System.out.println(" ");
        System.out.println(" ");


        // Task 2. Show first half of the array using "for" cycle.
        // Задача 2. Вывести первую половину массива (Вывести первую половину элементов массива
        // при помощи цикла for).

        int[] nums2 = {7, -3, 9, -11, 18, 99, 2, 11};
        System.out.println("Task 2");
        System.out.println("Original array: " + Arrays.toString(nums2));
        System.out.print("First half of elements:");

        for (int i = 0; i < nums2.length / 2; i++) {
            System.out.print(" " + nums2[i]);
        }
        System.out.println(" ");
        System.out.println(" ");


        // Task 3. Show the second half of the array using "for" cycle. Realization of the task should be processed
        // in any even quantity of elements.
        // Задача 3. Вывести вторую половину массива (Вывести вторую половину элементов массива
        // при помощи цикла for). Реализация задачи должна работать при любом чётном
        // количестве элементов.

        int[] nums3 = {7, -3, 9, -11, 18, 99, 2, 11};
        System.out.println("Task 3");
        System.out.println("Original array: " + Arrays.toString(nums3));
        System.out.print("Second half of elements:");

        for (int i = nums3.length / 2; i < nums3.length; i++) {
            System.out.print(" " + nums3[i]);
        }
        System.out.println(" ");
        System.out.println(" ");


        // Task 4. Show all elements except of the first and last ones.
        // Задача 4. Вывести все элементы кроме первого и последнего.

        int[] nums4 = {7, -3, 9, -11, 18, 99, 2, 11};
        System.out.println("Task 4");
        System.out.print("Elements of the array except of the first and last ones:");

        for (int i = 1; i < nums4.length - 1; i++) {
            System.out.print(" " + nums4[i]);
        }
        System.out.println(" ");
        System.out.println(" ");


        // Task 5. Show last 3 elements of the array (e.g. for the array[7, -3, 9, -11, 18, 99, 2, 11]
        // the output should be: 99, 2, 11).
        // Задача 5. Вывести последние 3 элемента массива (Для массива [7, -3, 9, -11, 18, 99, 2, 11]
        // вывод должен быть таким: 99, 2, 11).

        int[] nums5 = {7, -3, 9, -11, 18, 99, 2, 11};
        System.out.println("Task 5");
        System.out.println("Original array: " + Arrays.toString(nums5));
        System.out.print("Last 3 elements:");

        for (int i = nums5.length - 3; i < nums5.length; i++) {
            System.out.print(" " + nums5[i]);
        }
        System.out.println(" ");
        System.out.println(" ");


        // Task 6. Show even elements in order (every second element. E.g. second, fourth, sixth elements should be shown.
        // Positions and indexes for elements: 1,3,5...n (constant increase by 2)).
        // Задача 6. Вывести чётные элементы массива по порядку (Вывести только чётные элементы
        // массива по порядку (каждый второй элемент). Необходимо будет вывести второй,
        // четвёртый, шестой и т.д. элементы. Позиции (индексы) для необходимых элементов:
        // 1, 3, 5...n (постоянное увеличение на 2).

        int[] nums6 = {7, -3, 9, -11, 18, 99, 2, 11};
        System.out.println("Task 6");
        System.out.println("Original array: " + Arrays.toString(nums6));
        System.out.print("Even elements by order (every second):");

        for (int i = 1; i < nums6.length; i += 2) {
            System.out.print(" " + nums6[i]);
        }
        System.out.println(" ");
        System.out.println(" ");


        // Task 7. Show quantity of negative and positive elements(it is necessary to find the quantity of
        // negative and positive elements and show it). To realize you will need 2 variables for keeping quantity
        // of elements: one for positive elements for example positiveCount. The other one for keeping negative
        // elements, for example negativeCount. You can choose the names for variables at your own discretion.
        // Задача 7. Вывести количество положительных и отрицательных элементов (необходимо
        // определить количество положительных и отрицательных элементов в массиве и
        // вывести его). В реализации задачи понадобится определить 2 переменные для
        // хранения количества элементов: Одна переменная для хранения количества
        // положительных элементов, допустим positiveCount. Вторая для хранения
        // количества отрицательных элементов, допустим negativeCount. Названия
        // переменных можно выбирать на своё усмотрение.

        int[] nums7 = {7, -3, 9, -11, 18, 99, 2, 11};
        System.out.println("Task 7");
        System.out.println("Original array: " + Arrays.toString(nums7));
        int positiveCount = 0;
        int negativeCount = 0;

        for (int num : nums7) {
            if (num > 0) {
                positiveCount++;
            } else if (num < 0) {
                negativeCount++;
            }
        }
        System.out.println("Quantity of positive elements: " + positiveCount);
        System.out.println("Quantity of negative elements: " + negativeCount);
        System.out.println(" ");


        // Task 8. Find maximal and minimal elements of the array and show it.
        // Задача 8. Найти максимальный и минимальный элементы массива (Необходимо
        // определить максимальный и минимальный элементы в массиве и вывести их).

        int[] nums8 = {7, -3, 9, -11, 18, 99, 2, 11};
        System.out.println("Task 8");
        System.out.println("Original array: " + Arrays.toString(nums8));
        int maxIndex = 0;
        int minIndex = 0;

        for (int i = 1; i < nums8.length; i++) {
            if (nums8[i] > nums8[maxIndex]) {
                maxIndex = i;
            } else if (nums8[i] < nums8[minIndex]) {
                minIndex = i;
            }
        }
        System.out.println("Maximal element: " + nums8[maxIndex]);
        System.out.println("Minimal element: " + nums8[minIndex]);
    }
}