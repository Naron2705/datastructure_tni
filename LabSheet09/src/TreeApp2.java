
public class TreeApp2 {

	public static void main(String[] args) {
		
		System.out.println("------------------------------");
		System.out.println("Binary Tree From CreateTree4()");
		System.out.println("------------------------------");
		BinaryTree tree01 = new BinaryTree();
		tree01.creatTree4();
		tree01.printTree(tree01.getRoot(), 0);
		
		System.out.println("------------------------------");
		System.out.println("Binary Tree From CreateTree5()");
		System.out.println("------------------------------");
		BinaryTree tree02 = new BinaryTree();
		tree02.creatTree5();
		tree02.printTree(tree02.getRoot(), 0);
		
		System.out.println("------------------------------");
		System.out.println("Binary Tree From CreateTree6()");
		System.out.println("------------------------------");
		BinaryTree tree03 = new BinaryTree();
		tree03.creatTree6();
		tree03.printTree(tree03.getRoot(), 0);
	}

}
