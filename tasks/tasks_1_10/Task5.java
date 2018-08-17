package tasks_1_10;

import org.junit.Test;

/*
2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.

What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
 */
public class Task5 {

	@Test
	public void test() {
		int n = 10, result = n, rest = -1;

		while (rest != 0) {
			for (int i = n; i > 1; i++) {
				if (result % n != 0) {
					break;
				}
				
				rest = result / n;
			}
		}
	}
}
