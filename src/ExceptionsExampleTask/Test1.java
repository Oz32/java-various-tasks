package ExceptionsExampleTask;

public class Test1 {
    public static void main(String[] args) {
        System.out.println("Начало Программы");

        try{
            System.out.println("Перед вызовом method1");
            method1();
            System.out.println("После вызова method1. Это строка никогда не будет показана");
        } catch (Exception e){
            System.out.println("Исключение было поймано");
        }
        System.out.println("программа все еще работает");
    }
    public static void method1(){
        int a = 5;
        int b = 0;
        System.out.println(a/b);
    }
}
