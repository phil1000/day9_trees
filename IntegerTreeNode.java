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
	
	public String toString() {
		String output = "[" + value;
		if (left==null && right==null) {
			output=output+"L[]R[]";
			return output+"]";
		} 
		if (left == null) {
			output=output+"L[]";
		} else {
			output=output+"L" + left.toString();
		}
		
		if (right==null) {
			output=output+"R[]";
		} else {
			output=output + "R" + right.toString();
		}
		return output+"]";
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