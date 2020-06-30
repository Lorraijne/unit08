package task02;

public class Group {
	final int k = 5;
	Student[] mas = new Student[k];

	public Group() {
		for (int i = 0; i < k; i++) {
			mas[i] = new Student();
		}
	}

	public int avgGroup() {
		int avgGr = 0;
		for (int i = 0; i < k; i++) {
			avgGr = mas[i].average() + avgGr;
		}
		return avgGr / k;
	}

	public int countGold() {
		int Gold = 0;
		for (int i = 0; i < k; i++) {

			if (mas[i].isGold() == true) {
				Gold++;
			}

		}
		return Gold;
	}

	public int countBlack() {
		int Black = 0;
		for (int i = 0; i < k; i++) {

			if (mas[i].isBlack() == true) {
				Black++;
			}

		}
		return Black;
	}

	public String toString() {

		String result = "";
		
		result += "Число студентов: " + Integer.toString(k) + "\nСредний балл: " + Integer.toString(avgGroup());
		result += "\nЧисло отличников: " + Integer.toString(countGold()) + "\nЧисло двоечников: "	+ Integer.toString(countBlack());
		for (int i = 0; i < k; i++) {
			result += "\nСтудент N " + i + " " + mas[i].toString();
		}
		return result;
	}

}
