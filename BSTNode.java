
public class BSTNode<T> {
	private Comparable<T> data;
	private BSTNode<T> left;
	private BSTNode<T> right;

	public BSTNode(Comparable<T> data) {
		this.data = data;
		this.left = null;
		this.right = null;
	}

	public Comparable<T> getData() {
		return data;
	}
	public void setData(Comparable<T> data) {
		this.data = data;
	}
	public BSTNode<T> getLeft() {
		return left;
	}
	public void setLeft(BSTNode<T> left) {
		this.left = left;
	}
	public BSTNode<T> getRight() {
		return right;
	}
	public void setRight(BSTNode<T> right) {
		this.right = right;
	}
}
