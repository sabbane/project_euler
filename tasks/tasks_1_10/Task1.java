package tasks_1_10;

import org.junit.Test;

/*
If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.

Find the sum of all the multiples of 3 or 5 below 1000.
 */
public class Task1 {

	@Test
	public void test() {
		int n = 1000, result = 0;

		for (int i = 1; i < n; i++) {
			if (i % 3 == 0 || i % 5 == 0) {
				result += i;
			}
		}

		System.out.println("Result: " + result);
	}
}
