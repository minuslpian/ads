package treeStructure;

public class BinaryTree {
	private BTNode root;
	private int count;
	public BinaryTree() {
		
	}
	public void addNode(int data) throws Exception {
		BTNode newNode = new BTNode(data);
		if(root==null) {
			root= newNode;
			count++;
		}
		else {
			BTNode trav=root;
			
			while(true) {
				if(newNode.getData() < trav.getData()) {
					if(trav.getLeftChild() == null) {
						trav.setLeftChild(newNode);
						count++;
						break;
					}else {
						trav=trav.getLeftChild();
					}
				}else if(newNode.getData() > trav.getData()) {
					if(trav.getRightChild() == null) {
						trav.setRightChild(newNode);
						count++;
						break;
					}else {
						trav=trav.getRightChild();
					}
				}else
					throw new Exception("Duplicate values are not allowed!!");
			}
		}
	}
	public void inOrder() {
		inOrder(root);
	}
	public void inOrder(BTNode trav) {
			if(trav != null) {
				inOrder(trav.getLeftChild());
				System.out.print(trav.getData()+"  ");
				inOrder(trav.getRightChild());
			}
	}
	public void preOrder() {
		preOrder(root);
	}
	public void preOrder(BTNode trav) {
		if(trav != null) {
			System.out.print(trav.getData()+"  ");
			preOrder(trav.getLeftChild());
			preOrder(trav.getRightChild());
		}
	}
	public void postOrder(BTNode trav) {
		if(trav != null) {
			postOrder(trav.getLeftChild());
			postOrder(trav.getRightChild());
			System.out.print(trav.getData()+"  ");
		}
	}
	public void postOrder() {
		postOrder(root);
	}
	public int getCount() {
		return count;
	}
	
//	public int leafCount() {
//		BTNode trav = root;
//		if(trav == null) {
//			return 0;
//		}
//		else {
//			while(trav.getLeftChild()!= null)
//				trav=trav.getLeftChild()
//		}
//	}

}
