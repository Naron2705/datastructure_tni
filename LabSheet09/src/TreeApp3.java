
public class TreeApp3 {

	public static void main(String[] args) {

		BinaryTree tree = new BinaryTree();
		tree.creatTree5();
		tree.printTree(tree.getRoot(), 0);
		
		System.out.println("------------------------------");
		
		tree.delete(50);
		System.out.println("Prent = "+ tree.parent.data);
		System.out.println("DeleteNode = "+ tree.deleteNode.data);
		System.out.println("------------------------------");
		tree.printTree(tree.getRoot(), 0);

	}

}
