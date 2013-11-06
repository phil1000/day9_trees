public class IntegerTreeScript {
	public void launch() {
		int[] integerArray = {6,5,9,3,8,11,12};
		
		IntegerTreeNode root = new IntegerTreeNode(integerArray[0]);
		for (int i=1; i<integerArray.length;i++) {
			root.add(integerArray[i]);
		}
		
		System.out.println("Maximum value = " + root.getMax());
		System.out.println("Minimum value = " + root.getMin());
		
		if (root.contains(12)) {
			System.out.println("12 exists");
		}
		else {
			System.out.println("12 does not exist");
		}
		
		if (root.contains(1)) {
			System.out.println("1 exists");
		}
		else {
			System.out.println("1 does not exist");
		}
		
		System.out.println(root.toString());
	}
	
	public static void main(String[] args) {
		IntegerTreeScript myTree = new IntegerTreeScript();
		myTree.launch();
	}
}