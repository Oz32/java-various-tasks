package AbstractPlasticTree;

public class PlasticTree extends Tree{
    public PlasticTree(int mass, int height) {
        super(mass, height);
    }

    @Override
    public Tree copy(){
        System.out.println("clone");
        return new PlasticTree(this.getMass(), this.getHeight());
    }
}
