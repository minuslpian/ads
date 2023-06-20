package com.app.main;

import treeStructure.BinaryTree;

public class Tester {
	public static void main(String[] args) throws Exception {
		BinaryTree bt = new BinaryTree();
		bt.addNode(50);
		bt.addNode(20);
		bt.addNode(40);
		bt.addNode(10);
		bt.addNode(70);
		bt.addNode(24);
		
		bt.inOrder();
		System.out.println();
		bt.preOrder();
		System.out.println();
		bt.postOrder();
		System.out.println(bt.getCount());
	}
}
