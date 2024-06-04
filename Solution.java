import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner fs = new Scanner(System.in);
		int T = 1;
		T = fs.nextInt();
		for (int tc = 1; tc <= T; tc++) {
			int n = fs.nextInt(), a = fs.nextInt(), b = fs.nextInt();
			int regular = n * a;
			int promo = n / 2 * b + ((n % 2 == 1) ? a : 0);
			System.out.println(Math.min(regular, promo));
		}
		fs.close();
	}
}
