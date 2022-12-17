package VariousJavaTasks;

public class Task4 {
    public static void main(String[] args) {
        String text = "application hello template";
        String word = "hello";
        int count = 0;
        int a = 0;
        for(int i = 0; i<text.length(); i++){
            int g = text.indexOf(word,i);
            i=g;
            if(g!=-1) {
                count++;
            }
        }
        System.out.println(count);
    }
}
