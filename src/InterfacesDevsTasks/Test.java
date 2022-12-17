package InterfacesDevsTasks;

public class Test {
    public static void main(String[] args) {
        IDeveloper dev1 = new JavaDeveloper();
        IDeveloper dev2 = new KotlinDeveloper();

        IManager manager = new BestManager();
        manager.speak(dev1);
        manager.speak(dev2);


    }
}
