package AbstractPlasticTree;

public class TreeTest {
    public static void main(String[] args) {
        PlasticTree plasticTree = new PlasticTree(2, 5);
        PlasticTree anotherPlasticTree = (PlasticTree) plasticTree.copy();
        PlasticTree anotherPlasticTree2 = (PlasticTree) plasticTree.copy();
        PlasticTree anotherPlasticTree3 = (PlasticTree) plasticTree.copy();
    }
}
