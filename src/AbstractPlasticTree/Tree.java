package AbstractPlasticTree;

public abstract class Tree {
    private int mass;
    private int height;

    public Tree(int mass, int height) {
        this.mass = mass;
        this.height = height;
    }

    public abstract Tree copy();

    public int getMass() {
        return mass;
    }

    public void setMass(int mass) {
        this.mass = mass;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}
