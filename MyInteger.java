package school;

public class MyInteger {
	int value;
	
	public MyInteger (int newInteger) {
		value = newInteger;
	}
	
	public int getValue() {
		return value;
	}
	
	public boolean isEven () {
		if (value % 2 == 1) {
			return false;
		}else {
			return true;
		}
	}
	
	public boolean isOdd () {
		return !isEven();
	}
	
	public boolean isPrime () {
		double m = Math.ceil(Math.sqrt(value));
		for (int i = 2; i <= m; i++ ) {
			if (value % i == 0) {
				return false;
			}
			
		}
		return true;
	}
	
	public static boolean isEven (int checkValue) {
		if (checkValue % 2 == 1) {
			return false;
		}else {
			return true;
		}
	}
	
	public static boolean isOdd (int checkValue) {
		return !isEven(checkValue);
	}
	
	public static boolean isPrime (int checkValue) {
		double m = Math.ceil(Math.sqrt(checkValue));
		for (int i = 2; i <= m; i++ ) {
			if (checkValue % i == 0) {
				return false;
			}
			
		}
		return true;
	}
	
	public static boolean isEven (MyInteger checkValue) {
		if (checkValue.getValue() % 2 == 1) {
			return false;
		}else {
			return true;
		}
	}
	
	public static boolean isOdd (MyInteger checkValue) {
		return !isEven(checkValue);
	}
	
	public static boolean isPrime (MyInteger checkValue) {
		double m = Math.ceil(Math.sqrt(checkValue.getValue()));
		for (int i = 2; i <= m; i++ ) {
			if (checkValue.getValue() % i == 0) {
				return false;
			}
			
		}
		return true;
	}
	
	public boolean equals (int num) {
		if (value == num) {
			return true;
		}else {
			return false;
		}
	}
	
	public boolean equals (MyInteger check) {
		if (value == check.getValue()) {
			return true;
		}else {
			return true;
		}
	}
	
	public static int parseInt(char[] array) {
		int length = array.length;
		int number = 0;
		for (int i = 0; i < length; i++) {
			int c = Character.getNumericValue(array[i]);
			number += c * Math.pow(10, length - i); 
		}
		return number;
	}
	
	public static int parseInt(String toInt) {
		return Integer.parseInt(toInt);
	}
}
