package InheritanceDevsTask;

public class JSDeveloper extends Developer{
    @Override
    public void writeCode(){
        System.out.println("Use JS syntax");
    }

    @Override
    public void reaction() {
        System.out.println("Not bad");
    }
}
