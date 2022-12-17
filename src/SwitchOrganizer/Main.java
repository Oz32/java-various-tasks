package SwitchOrganizer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> spisok = new ArrayList<>();
        spisok.add("Сходить в магазин");
        spisok.add("Погулять с собакой");
        spisok.add("Оплатить счет");

        while (true) {
            System.out.println("Добро пожаловать в список дел. Введите соответствующую цифру для совершения операций\n" +
                    "1. Добавить задачу\n" +
                    "2. Вывести список задач\n" +
                    "3. Удалить задачу\n" +
                    "0. Выход");
            String choice = reader.readLine();

            if (choice.equals("1")) {
                System.out.println("Добавьте задачу");
                spisok.add(reader.readLine());
                System.out.println("Задача успешно добавлена");
                System.out.println(" ");
            } else if (choice.equals("2")) {
                for (String s : spisok) {
                    System.out.println(s);
                }
                System.out.println(" ");
            } else if (choice.equals("3")) {
                System.out.println("Укажите какую по счету задачу надо удалить");
                spisok.remove(Integer.parseInt(reader.readLine()) - 1);
                System.out.println("Задача успешно удалена");
                System.out.println(" ");
            } else if (choice.equals("0")) {
                System.out.println("Выход из системы. До свидания!");
                return;
            } else {
                System.out.println("Неверный ввод, попробуйте еще раз");
            }
        }
    }
}