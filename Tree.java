package treedemo;


public class Tree<T> {
    private TreeNode<T> root;
    public boolean isEmpty()
    {
        return root == null;
    }
    public void addRoot(TreeNode<T> newNode)
    {
        root = newNode;

    }
    public void print()
    {
        System.out.print("The Main Node is " );
        print(root);
    }
    private void print(TreeNode<T> node)
    {
        if(node != null)
        {
            System.out.println("The  next node is " + node.getValue());
            if(node.getLeft() != null){

                System.out.println(node.getLeft().getValue() + " is left of " + node.getValue());

            }
            if( node.getRight() != null){

                System.out.println(node.getRight().getValue() + " is right of " + node.getValue());
            }
            print(node.getLeft());

            print(node.getRight());

        }
    }

}
