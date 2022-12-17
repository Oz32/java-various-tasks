package HashCodeStringsTasks;

public class Person1 {
    String name;
    int dnaCode;

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Person1 person = (Person1) obj;
        return dnaCode == person.dnaCode;
    }

    @Override
    public int hashCode() {
        return dnaCode;
    }
}