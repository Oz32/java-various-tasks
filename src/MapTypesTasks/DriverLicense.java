package MapTypesTasks;

public class DriverLicense {
    private int id;
    private String name;

    public DriverLicense(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String toString() {
        return name;
    }
}
