package task01;
import java.util.Random;

public class Work {

	public static void main(String[] args) {
		final int k = 5;
		Fraction[] mas = new Fraction[k];

		Random rand = new Random();
		for (int i = 0; i < k; i++) {
			mas[i] = new Fraction(rand.nextInt(10), rand.nextInt(10));
		}
		
		for (int i = 0; i < k; i++) {
			System.out.println(mas[i].toString());
		}
		
	}

}
