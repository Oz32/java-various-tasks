package InheritanceDevsTask;

public class JavaDeveloper extends Developer{
    @Override
    public void writeCode(){
        System.out.println("Use Java syntax");
    }

    @Override
    public void reaction() {
        System.out.println("Cool");
    }
}
