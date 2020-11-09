package school;

public class Emirp {

	public static void main(String[] args) {
		
		int numbers = 120;
		int i = 0;
		int num = 2;
		while (i < numbers) {
			if (isEmirp(num)) {
				System.out.println(num + " ");
				i++;
			}
			num++;
		}

	}
	public static boolean isEmirp (int num) {
		
		boolean isNP = true;
		int reversed = 0;
		double m = Math.ceil(Math.sqrt(num));
		for (int i = 2; i <= m; i++ ) {
			if (num % i == 0) {
				isNP = false;
				break;
			}
		}
		while (num != 0) {
			  int digit = num % 10;
	          reversed = reversed * 10 + digit;
	          num /= 10;
		}
		if (reversed == num) {
			isNP = false;
		}
		double n = Math.ceil(Math.sqrt(reversed));
		for (int i = 2; i <= n; i++ ) {
			if (reversed % i == 0) {
				isNP = false;
				break;
			}
		}
		return isNP;
	}
}
