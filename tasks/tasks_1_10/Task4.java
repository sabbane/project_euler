package tasks_1_10;

import org.junit.Test;

/*
A palindromic number reads the same both ways. The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.

Find the largest palindrome made from the product of two 3-digit numbers.
 */
public class Task4 {

	@Test
	public void test() {
		int n = 999, result = 0;

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				int product = i * j;
				if (isPalindromic(product) && product > result) {
					result = product;
				}
			}
		}

		System.out.println("Result: " + result);
	}

	private boolean isPalindromic(int number) {
		String originalNumber = "" + number;
		String reversedNumber = new StringBuilder(originalNumber).reverse().toString();

		if (originalNumber.equals(reversedNumber)) {
			return true;
		}

		return false;
	}
}
