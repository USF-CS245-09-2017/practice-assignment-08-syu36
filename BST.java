public class BST<T> {
	public BSTNode<T> root;

	public boolean find(Comparable<T> value) {
		return find(root, value);
	}

	@SuppressWarnings("unchecked")
	private boolean find(BSTNode<T> node, Comparable<T> value) {
		if (node == null) {
			return false;
		}

		if (value.compareTo((T) node.getData()) == 0) {
			return true;
		} else if (value.compareTo((T) node.getData()) < 0) {
			return find(node.getLeft(), value);
		} else {
			return find(node.getRight(), value);
		}
	}

	public void insert(Comparable<T> value) {
		root = insert(root, value);
	}

	@SuppressWarnings("unchecked")
	private BSTNode<T> insert(BSTNode<T> node, Comparable<T> value) {
		if (node == null) {
			BSTNode<T> newNode = new BSTNode<T>(value);
			return newNode;
		} else if (value.compareTo((T) node.getData()) < 0) {
			node.setLeft(insert(node.getLeft(), value));
		} else {
			node.setRight(insert(node.getRight(), value));
		}

		return node;
	}

	public void delete(Comparable<T> value) {
		delete(root, value);
	}

	@SuppressWarnings("unchecked")
	private BSTNode<T> delete(BSTNode<T> node, Comparable<T> value) {
		if (node == null) {
			return null;
		}

		if (node.getData().compareTo((T) value) == 0) {
			if (node.getLeft() == null) {
				node.setData(node.getRight().getData());
				node.setRight(node.getRight().getRight());
				return node;
			} else if (node.getRight() == null) {
				node.setData(node.getLeft().getData());
				node.setLeft(node.getLeft().getLeft());
				return node;
			} else {
				if (node.getRight().getLeft() == null) {
					node.setData(node.getRight().getData());
					node.setRight(node.getRight().getRight());
					return node;
				}
				else{
					BSTNode<T> successor = successor(node);
					successor.setRight(node.getRight());
					successor.setLeft(node.getLeft());
					node = successor;
					return node;
				}
			}
		} else if (node.getData().compareTo((T) value) > 0){
			node.setRight(delete(node.getRight(), value));
		} else {
			node.setLeft(delete(node.getLeft(), value));
		}

		return node;
	}

	public void print() {
		print(root);
	}

	private void print(BSTNode<T> node) {
		if (node != null) {
			print(node.getLeft());
			System.out.println(node.getData());
			print(node.getRight());
		}
	}

	public BSTNode<T> successor(BSTNode<T> node) {
		return successorLeft(node.getRight());
	}

	private BSTNode<T> successorLeft(BSTNode<T> node) {
		if (node.getLeft() == null) {
			return node;
		} else {
			return successorLeft(node.getLeft());
		}
	}
}
