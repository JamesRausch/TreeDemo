package treedemo;
//Create tree from picture
//Create better Print

public class Demo {
    public static void main(String[] args) {
        Tree<Integer> tree = new Tree<Integer>();
        TreeNode<Integer> nodeEight = new TreeNode<Integer>();
        nodeEight.setValue(8);
        TreeNode<Integer> nodeFive = new TreeNode<Integer>();
        nodeFive.setValue(5);
        nodeEight.addLeft(nodeFive);
        TreeNode<Integer> nodeNine = new TreeNode<Integer>();
        nodeNine.setValue(9);
        nodeFive.addLeft(nodeNine);
        TreeNode<Integer> nodeSeven = new TreeNode<Integer>();
        nodeSeven.setValue(7);
        nodeFive.addRight(nodeSeven);
        TreeNode<Integer> nodeOne = new TreeNode<Integer>();
        nodeOne.setValue(1);
        nodeSeven.addLeft(nodeOne);
        TreeNode<Integer> nodeTweleve = new TreeNode<Integer>();
        nodeTweleve.setValue(12);
        nodeSeven.addRight(nodeTweleve);
        TreeNode<Integer> nodeTwo = new TreeNode<Integer>();
        nodeTwo.setValue(2);
        nodeTweleve.addLeft(nodeTwo);
        TreeNode<Integer> nodeFour = new TreeNode<Integer>();
        nodeFour.setValue(4);
        nodeEight.addRight(nodeFour);
        TreeNode<Integer> nodeEleven = new TreeNode<Integer>();
        nodeEleven.setValue(11);
        nodeFour.addRight(nodeEleven);
        TreeNode<Integer> nodeThree = new TreeNode<Integer>();
        nodeThree.setValue(3);
        nodeEleven.addLeft(nodeThree);
        tree.addRoot(nodeEight);
        tree.print();

    }



}
