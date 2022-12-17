package MapTypesTasks;

import java.util.HashMap;
import java.util.Map;

public class Test1 {
    private static Map<Integer, DriverLicense> allLicenses = new HashMap<>();

    public static void main(String[] args) {
        addLicenses();
        printAll();
    }

    private static void addLicenses(){
        addLicense(new DriverLicense(1, "Vasya"));
        addLicense(new DriverLicense(2, "Gena"));
        addLicense(new DriverLicense(3, "Vitya"));
        addLicense(new DriverLicense(4, "Masha"));
        addLicense(new DriverLicense(5, "Ira"));
    }

    private static void addLicense(DriverLicense license){
        allLicenses.put(license.getId(), license);
    }

    private static void printAll(){
        for (Map.Entry<Integer, DriverLicense> entry : allLicenses.entrySet()){
            System.out.println("id: " + entry.getKey() + " license: " + entry.getValue());
        }
    }
}
