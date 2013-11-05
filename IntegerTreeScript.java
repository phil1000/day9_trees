public class IntegerTreeScript {
	public void launch() {
		int[] integerArray = {6,5,9,3};
		
		IntegerTreeNode root = new IntegerTreeNode(integerArray[0]);
		for (int i=1; i<integerArray.length;i++) {
			root.add(integerArray[i]);
		}
		
		System.out.println("Maximum value = " + root.getMax());
		System.out.println("Minimum value = " + root.getMin());
		
		if (root.contains(76)) {
			System.out.println("76 exists");
		}
		else {
			System.out.println("76 does not exist");
		}
		
		if (root.contains(7699)) {
			System.out.println("7699 exists");
		}
		else {
			System.out.println("7699 does not exist");
		}
		
		root.printTree();
	}
	
	public static void main(String[] args) {
		IntegerTreeScript myTree = new IntegerTreeScript();
		myTree.launch();
	}
}