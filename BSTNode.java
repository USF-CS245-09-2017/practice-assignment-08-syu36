/**
 *
 * A node of the binary search tree.
 *
 * @param <T>
 */
public class BSTNode<T> {
	private Comparable<T> data;
	private BSTNode<T> left;
	private BSTNode<T> right;

	/**
	 * Initializes the node with some value.
	 * @param data
	 */
	public BSTNode(Comparable<T> data) {
		this.data = data;
		this.left = null;
		this.right = null;
	}

	/**
	 * Gets the data of the node.
	 * @return the data
	 */
	public Comparable<T> getData() {
		return data;
	}

	/**
	 * Sets the data of the node.
	 * @param data the data
	 */
	public void setData(Comparable<T> data) {
		this.data = data;
	}

	/**
	 * Gets the node to the left of this node.
	 * @return the node to the left
	 */
	public BSTNode<T> getLeft() {
		return left;
	}

	/**
	 * Sets the node to the left of this node.
	 * @param left the new node
	 */
	public void setLeft(BSTNode<T> left) {
		this.left = left;
	}

	/**
	 * Gets the node to the right of this node.
	 * @return the node to the right
	 */
	public BSTNode<T> getRight() {
		return right;
	}

	/**
	 * Sets the node to the left of this node.
	 * @param right the new node
	 */
	public void setRight(BSTNode<T> right) {
		this.right = right;
	}
}
