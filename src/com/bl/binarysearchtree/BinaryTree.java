package com.bl.binarysearchtree;

import java.util.Scanner;

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

	// getting the size of tree
	public void size() {
		System.out.println(" The size of the tree is= " + sizeAll(root));
	}

	public int sizeAll(Node root) {

		if (root == null)
			return 0;

		return sizeAll(root.left) + sizeAll(root.right) + 1;
	}

	// searching 63 in binary tree
	public void search(int x) {

		if (searchAll(root, x))
			System.out.println("Searched element found! ");
		else
			System.out.println(" Searched element not found");
	}

	public boolean searchAll(Node root, int x) {

		if (root == null)
			return false;
		if (root.x == x)
			return true;
		else
			return searchAll(root.left, x) || searchAll(root.right, x);
	}

}
