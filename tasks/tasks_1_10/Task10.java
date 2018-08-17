package tasks_1_10;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

/*
The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.

Find the sum of all the primes below two million.
 */
public class Task10 {

	@Test
	public void test() {
		long number = 2000000;
		List<Long> primes = getPrimesLowerThanNumber(number);

		long result = primes.stream().mapToLong(Long::longValue).sum();

		System.out.println("Result: " + result);
	}

	private List<Long> getPrimesLowerThanNumber(long number) {
		boolean prime;
		List<Long> primes = new ArrayList<>();
		primes.add((long) 2);

		for (long i = 3; i < number; i++) {
			prime = true;
			for (int j = 2; j < i - 1; j++) {
				if (i % j == 0) {
					prime = false;
					break;
				}
			}
			if (prime) {
				primes.add(i);
			}
		}

		return primes;
	}
}