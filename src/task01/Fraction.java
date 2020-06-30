package task01;

public class Fraction {
	int m = 0;
	int n = 1;

	public int getM() {
		return this.m;
	}

	public void setM(int m) {
		this.m = m;
	}

	public int getN() {
		return this.n;
	}

	public void setN(int n) {

		if (n == 0) {
			return;
		} else {
			this.n = n;
		}
	}

	public String toString() {
		return (m + "/" + n);
	}

	public Fraction(int m, int n) {
		this.m = m;
		this.n = n;
	}
	
}
