package com.bl.binarysearchtree;

public class Node implements Comparable<Node>{
	
	int x;
	Node right;
	Node left;

	public Node(int x) {
		super();
		this.x = x;
	}

	@Override
	public int compareTo(Node node) {
		// TODO Auto-generated method stub

		if(this.x > node.x) {
			return 1;
			}
		else if (this.x < node.x) {
			return -1;
			}
		else {
			return 0;}
	}	

}
