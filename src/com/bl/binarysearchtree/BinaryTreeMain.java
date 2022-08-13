package com.bl.binarysearchtree;

public class BinaryTreeMain {
	public static void main(String[] args) {
		System.out.println("Welcome to Binary Search Tree Program");
		// TODO Auto-generated method stub

		BinaryTree tree = new BinaryTree();
		// UC1
		tree.insert(56);
		tree.insert(30);
		tree.insert(70);
		tree.insert(22);
		tree.insert(40);
		tree.insert(60);
		tree.insert(95);
		tree.insert(11);
		tree.insert(65);
		tree.insert(63);
		//UC2
		tree.size();
		//UC3
		tree.search(63);
	}

}
