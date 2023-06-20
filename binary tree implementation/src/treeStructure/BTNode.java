package treeStructure;

public class BTNode {
	int data;
	BTNode leftChild;
	BTNode rightChild;
	BTNode(int data){
		this.data=data;
	}
	public BTNode getLeftChild() {
		return leftChild;
	}
	public void setLeftChild(BTNode leftChild) {
		this.leftChild = leftChild;
	}
	public BTNode getRightChild() {
		return rightChild;
	}
	public void setRightChild(BTNode rightChild) {
		this.rightChild = rightChild;
	}
	public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
	}
	
}
