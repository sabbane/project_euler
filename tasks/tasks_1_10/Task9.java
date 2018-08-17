package tasks_1_10;

import org.junit.Test;

/*
A Pythagorean triplet is a set of three natural numbers, a < b < c, for which,

a^2 + b^2 = c^2

For example, 3^2 + 4^2 = 9 + 16 = 25 = 5^2.

There exists exactly one Pythagorean triplet for which a + b + c = 1000.
Find the product abc.
 */

public class Task9 {

	@Test
	public void test() {
		int sum = 1000, result = 0;
		String numbers = "";

		for (int a = 1; a < sum; a++) {
			for (int b = 1; b < sum; b++) {
				for (int c = 1; c < sum; c++) {
					if ((Math.pow(a, 2) + Math.pow(b, 2) - Math.pow(c, 2) == 0) && (a + b + c == sum)) {
						result = a * b * c;
						numbers = a + " " + b + " " + c;
					}
				}
			}
		}

		System.out.println("Result: " + result + "     Numbers: " + numbers);
	}
}
