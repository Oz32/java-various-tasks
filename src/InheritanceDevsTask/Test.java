package InheritanceDevsTask;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        Developer dev1 = new JavaDeveloper();
        dev1.setLangName("Java");

        Developer dev2 = new JSDeveloper();
        dev2.setLangName("JS");

        List<Developer> devList = new ArrayList<>();
        devList.add(dev1);
        devList.add(dev2);

        showReaction(devList);

        for (Developer dev :
                devList) {
            dev.writeCode();
        }
    }

    public static void showReaction(List<Developer> devList) {
        for (Developer developer :
                devList) {
            developer.reaction();
        }
    }
}
