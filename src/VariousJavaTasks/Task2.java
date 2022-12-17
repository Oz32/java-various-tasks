package VariousJavaTasks;

public class Task2 {
    public static void main(String[] args) {
        String[] names = {"Alex", "Drake", "Anya", "Leon", "Adam"};
        for (int i = 0; i < names.length; i++) {
            if (names[i].startsWith("A")) {
                System.out.println(names[i]);
            }
        }
        System.out.println(" ");
        for (String name : names) {
            int i = name.indexOf("A");
            if (i == 0) {
                System.out.println(name);
            }
        }
        System.out.println(" ");
        int z = 1;
        while (true) {
            if (names[z-1].isEmpty()) {
                return;
            }
            char a = names[z-1].charAt(0);
            if (a == 'A') {
                System.out.println(names[z-1]);
            }
            z++;
        }
    }
}