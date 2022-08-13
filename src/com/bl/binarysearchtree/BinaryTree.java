package com.bl.binarysearchtree;

public class BinaryTree {

	Node root;

	public void insert(int x) {

		Node newNode = new Node(x);
		this.root = insertAll(root, newNode);
		display(this.root);
		System.out.println();
	}
// insert roots and nodes
	public Node insertAll(Node root, Node node) {

		if (root == null)
			return node;
		else if (root.compareTo(node) > 0) {

			root.left = insertAll(root.left, node);
		}

		else if (root.compareTo(node) < 0) {

			root.right = insertAll(root.right, node);
		}

		return root;
	}
// display method
	public void display(Node root) {
		if (root == null)
			return;

		display(root.left);
		System.out.print(" " + root.x);
		display(root.right);
	}

}
