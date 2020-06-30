package task02;

import java.util.Random;

public class Student {
	int idNumber;

	final int k = 4;
	int[] notes = new int[k];

	public boolean isGold() {

		for (int i = 0; i < k; i++) {

			if (notes[i] < 9) {
				return false;
			}
		}
		return true;
	}

	public boolean isBlack() {

		for (int i = 0; i < k; i++) {

			if (notes[i] == 2) {
				return true;
			}
		}
		return false;
	}

	public Student() {

		Random rand = new Random();
		this.idNumber = (rand.nextInt(1000));

		for (int i = 0; i < k; i++) {
			this.notes[i] = 8 + (rand.nextInt(3));
		}

	}

	public int average() {
		int sum = 0;
		for (int i = 0; i < k; i++) {
			sum = this.notes[i] + sum;
		}
		return sum / k;
	}

	public String toString() {
		String result = "";

		result += Integer.toString(idNumber) + " Оценки: ";
		for (int i = 0; i < k; i++) {
			result += Integer.toString(notes[i]) + ", ";
		}
		return result;
	}

};
