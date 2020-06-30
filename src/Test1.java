
public class Test1 {
	int first = 0;
	int second = 0;

	public int getFirst() {
		 return this.first;
	}
	
	public void printFirst() {
		System.out.println("first = " + first);
	}
	
	 public void setFirst(int first) {
	        this.first = first;
	    }
	
	public int getSecond() {
		 return this.second;
	}
	
	public void printSecond() {
		System.out.println("first = " + first);
	}
	
	 public void setSecond(int second) {
	        this.second = second;
	    }

	public int sum() {
		return first + second;
	}

	public int max() {
		if (first >= second) {
			return first;
		} else {
			return second;
		}
	}
}

