package ExceptionsExampleTask;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Test2 {
    public static void main(String[] args) {
        try {
            startAllMethods();
        } catch (FileNotFoundException ex){
            System.out.println("Обработано");
        }
    }

    public static void readTextFile() throws FileNotFoundException{
        FileInputStream file = new FileInputStream("file.txt");
    }

    public static void startAllMethods() throws FileNotFoundException{

    }
}
