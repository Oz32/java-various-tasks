package VariousJavaTasks;

public class Task3 {
    public static void main(String[] args) {
        String text = "application hello transaction template";
        int a = text.indexOf(" ");
        int b = text.lastIndexOf(" ");
        System.out.println(text.substring(0, a) + " " + text.substring(b));
        System.out.println(" ");
        for (int c = 0; c < text.length(); c++) {
            if (text.charAt(c) != ' ') {
                System.out.print(text.charAt(c));
            } else if (text.charAt(c) == ' ') {
                break;
            }
        }
        System.out.print(" ");
        for (int d = b; d < text.length(); d++) {
            System.out.print(text.charAt(d));
        }
    }
}
