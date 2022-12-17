package HashCodeStringsTasks;

public class Main {
    public static void main(String[] args) {
        Person p1 = new Person("Василий", "Петров", 23);
        System.out.println(p1);

LuxuryAuto l1 = new LuxuryAuto("Mercedes GLA", 2022, 70000);
LuxuryAuto l2 = new LuxuryAuto("Mercedes GLA", 2022, 70000);
        System.out.println(l1.equals(l2));
        System.out.println(l1.hashCode());
        System.out.println(l2.hashCode());
        System.out.println(l1.hashCode() == l2.hashCode());
    }
}
