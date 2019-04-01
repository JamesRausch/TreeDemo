package treedemo;

public class TreeNode<T> {
    private TreeNode<T> left;
    private TreeNode<T> right;
    private T value;
    public void addLeft(TreeNode<T> newNode)
    {
        left = newNode;

    }
    public void addRight(TreeNode<T> newNode)
    {
        right = newNode;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public TreeNode<T> getLeft() {
        return left;
    }

    public TreeNode<T> getRight() {
        return right;
    }
    public boolean isLeft(TreeNode<T> node)
    {
        return node == left;
    }
    public boolean isRight(TreeNode<T> node)
    {
        return node == right;
    }
}
