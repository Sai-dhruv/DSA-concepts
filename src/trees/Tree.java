package trees;

public class Tree {
	
	Tree(){
		root = null;
	}


	class Node{
		int key;
		Node left;
		Node right;

		Node(int data){
			key = data;
			left = null;
			right = null;
		}
	}

	Node root;

	void insert(int key) {

		root = insertRec(root, key);
		
	}

	Node insertRec(Node root, int key) {
		if(root == null) {
			root = new Node(key);
			return root;
		}
		else if(key < root.key) {
			root.left = insertRec(root.left, key);
		}
		else if (key > root.key) {
			root.right = insertRec(root.right, key);
		}
		return root;
	}

	void inorder() {
		inOrderRec(root);

	}
	private void inOrderRec(Node root) {
		if(root != null) {
			inOrderRec(root.left);
			System.out.println(root.key);
			inOrderRec(root.right);
		}
	}

	public static void main(String[] args) {

		Tree tree = new Tree();
		//tree.insert(20);
		tree.insert(50);
		tree.insert(30);
		tree.insert(20);
		tree.insert(40);
		tree.insert(70);
		tree.insert(60);
		tree.insert(80);

		/*
        Let us create following BST
                  50
               /     \
              30      70
             /  \    /  \
           20   40  60   80 

		 */
		tree.inorder();
	}

}
