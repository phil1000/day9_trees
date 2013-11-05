public class IntegerTreeNode {
	private int value;
	private IntegerTreeNode right;
	private IntegerTreeNode left;
	
	public IntegerTreeNode(int value) {
		this.value=value;
		right=null;
		left=null;
	}
	
	public void add(int newNumber) {
		if (newNumber > value) {
			if (right==null) {
				right = new IntegerTreeNode(newNumber);
			} else {
				right.add(newNumber);
			}
		} else {
			if (left==null) {
				left = new IntegerTreeNode(newNumber);
			} else {
				left.add(newNumber);
			}
		}
	}
	
	public int getMax() {		
		if (right==null) {
			return this.value;
		} else {
			if (this.value>right.value) {
				return this.value;
			} else {
				return right.getMax();
			}
		}
	}
	
	public int getMin() {
		if (left==null) {
			return this.value;
		} else {
			if (this.value<left.value) {
				return this.value;
			} else {
				return left.getMin();
			}
		}
	}
	
	public boolean contains(int newNumber) {
		if (value==newNumber) {
			return true;
		}
		else {
			if (newNumber > value) {
				if (right==null) {
					return false;
				} else {
					return right.contains(newNumber);
				}
			}
			else {
				if (left==null) {
					return false;
				} else {
					return left.contains(newNumber);
				}
			}
		}
	}
	
	public boolean printTree() {
		String output = "[" + value + " ";
		if (left==null) {
			output=output+"L[]";
			if (right==null) {
				System.out.print(output+" R[]");
				return false;
			} else {
				System.out.print(output+"R");
				return right.printTree();
			}
		} else {
			System.out.print(output+"L");
			return left.printTree();
		}
	}
	
	/*public boolean printIntegerlist() {
		if (this.nextInteger == null) {
			// came to end of list so can finish printing
			this.printInteger(); // print this instance of the patient
			return false;
		} else {
			this.printInteger();
			return this.nextInteger.printIntegerlist(); // recursive program 
		}
	}*/
}