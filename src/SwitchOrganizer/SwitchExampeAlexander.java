package SwitchOrganizer;

import java.util.ArrayList;
import java.util.Scanner;

public class SwitchExampeAlexander {
    public static void main(String[] args) {
        ArrayList<String> result = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {

            System.out.println("""
                    Выберите действие: 
                    1. Добавить задачу 
                    2. Вывести список задач
                    3. Удалить задачу
                    0. Выход""");

            String message = scanner.nextLine();
            try {
                switch (Integer.parseInt(message)) {
                    case 1 -> {
                        try {
                            System.out.println("Введите задачу для планирования");
                            String task = scanner.nextLine();
                            result.add(task);
                        } catch (Exception e) {
                            System.out.println("Неверный ввод, задача не добавлена, попробуйте еще раз.");
                        }
                    }
                    case 2 -> {
                        try {
                            System.out.println("Список задач:");
                            int counter = 0;
                            for (String task : result) {
                                counter++;
                                System.out.println(counter + ". " + task);
                            }
                        } catch (Exception e1) {
                            System.out.println("Неверный команда, невозможно сформировать список, попробуйте еще раз.");
                        }
                    }
                    case 3 -> {
                        try {
                            while (true) {
                                System.out.println("Выберите какую задачу удалить или введите finish:");
                                String index = scanner.nextLine();
                                if (index.equalsIgnoreCase("finish")) {
                                    break;
                                }
                                result.remove(Integer.parseInt(index) - 1);
                            }
                        } catch (Exception e2) {
                            System.out.println("Неверный ввод, задача не удалена, попробуйте еще раз.");
                        }
                    }
                }
                if (Integer.parseInt(message) == 0) {
                    break;
                }
            } catch (Exception w) {
                System.out.println("Неверный ввод, попробуйте еще раз");
            }
        }
    }
}