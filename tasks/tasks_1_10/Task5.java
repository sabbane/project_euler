package tasks_1_10;

import org.junit.Test;

/*
2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.

What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
 */
public class Task5 {

	@Test
	public void test() {
		long n = 20, result = 0;
		long max = calculateFactorial(n);

		for (long i = n; i < max; i += n) {
			if (checkNumber(i, n)) {
				result = i;
				break;
			}
		}

		System.out.println("Result: " + result);

	}

	private long calculateFactorial(long n) {
		long result = 1;
		if (n == 0) {
			return 1;
		}
		for (int i = 2; i <= n; i++) {
			result *= i;
		}

		return result;
	}

	private boolean checkNumber(long number, long basis) {
		for (long i = basis; i > 1; i--) {
			if (number % i != 0) {
				return false;
			}
		}
		return true;
	}
}
