package HashCodeStringsTasks;

public class Test {
    public static void main(String[] args) {
        Person1 p1 = new Person1();
        p1.name = "Alexey";
        p1.dnaCode = 209486;

        Person1 p2 = new Person1();
        p2.name = "Alexey";
        p2.dnaCode = 209486;

        System.out.println(p1 == p2);
    }
}
