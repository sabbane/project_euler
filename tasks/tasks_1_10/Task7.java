package tasks_1_10;

import org.junit.Test;

/*
By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.

What is the 10 001st prime number?
 */

public class Task7 {

	@Test
	public void test() {
		int primePosition = 10001, result = 2, currentNumber = 3;

		primePosition--;

		while (primePosition != 0) {
			if (isPrime(currentNumber)) {
				result = currentNumber;
				primePosition--;
			}
			currentNumber++;
		}

		System.out.println("Result: " + result);
	}

	private boolean isPrime(int number) {

		for (int i = 2; i < number - 1; i++) {
			if (number % i == 0) {
				return false;
			}
		}

		return true;
	}
}
