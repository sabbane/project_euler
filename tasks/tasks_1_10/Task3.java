package tasks_1_10;

import org.junit.Test;

/*
The prime factors of 13195 are 5, 7, 13 and 29.

What is the largest prime factor of the number 600851475143 ?
 */
public class Task3 {

	@Test
	public void test() {
		long n = 600851475143L, largestFactor = 1;

		for (int i = 2; i <= n; i++) {
			if (n % i == 0) {
				if (isPrime(i)) {
					largestFactor = i;
					n = n / i;
				}
			}
		}

		System.out.println("Result: " + largestFactor);
	}

	private boolean isPrime(int number) {
		for (int i = 2; i < number; i++) {
			if (number % i == 0) {
				return false;
			}
		}

		return true;
	}
}
